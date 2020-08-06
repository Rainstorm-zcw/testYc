package com.example.testyc.service.impl;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.alibaba.fastjson.JSON;
import com.example.testyc.persistence.entity.SeckillOrder;
import com.example.testyc.persistence.entity.SeckillOrderExample;
import com.example.testyc.persistence.entity.SeckillProduct;
import com.example.testyc.persistence.entity.SeckillProductExample;
import com.example.testyc.persistence.mapper.SeckillOrderMapper;
import com.example.testyc.persistence.mapper.SeckillProductMapper;
import com.example.testyc.persistence.vo.ReturnResult;
import com.example.testyc.service.SecKillOrderService;
import com.example.testyc.util.RedisUtil;
import com.google.common.collect.Sets;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zcw
 * @date 2020-07-30 21:23:54
 * @apiNote 秒杀服务实现
 */
@Slf4j
@Service
public class SecKillOrderServiceImpl implements SecKillOrderService {

    @Autowired
    private SeckillOrderMapper seckillOrderMapper;

    @Autowired
    private SeckillProductMapper seckillProductMapper;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private RedisUtil redisUtil;

    private Lock lock = new ReentrantLock();


    @Transactional
    @Override
    public synchronized ReturnResult createSecKillOrder(SeckillOrder seckillOrder) {
        log.info("输出:{}", JSON.toJSONString(seckillOrder));
        ReturnResult returnResult = new ReturnResult();
        try {
            seckillOrder.setStatus("1");
            seckillOrder.setCreateTime(new Date());
            seckillOrder.setPayTime(new Date());
            seckillOrder.setMoney(new BigDecimal("5299"));
            seckillOrder.setSaleMoney(new BigDecimal("0"));
            seckillOrder.setSellerId(1);
            SeckillProduct seckillProduct = seckillProductMapper.selectByPrimaryKey(seckillOrder.getSeckillId());
            if (Objects.nonNull(seckillProduct.getStockNum()) && seckillProduct.getStockNum() > 0) {
                SeckillProduct editSecKillProduct = new SeckillProduct();
                editSecKillProduct.setId(seckillProduct.getId());
                editSecKillProduct.setStockNum(seckillProduct.getStockNum() - 1);
                if (seckillProductMapper.updateByPrimaryKeySelective(editSecKillProduct) > 0) {
                    int insert = seckillOrderMapper.insert(seckillOrder);
                    if (insert > 0) {
                        returnResult.setStatus("1");
                        returnResult.setMessage("创建秒杀订单成功");
                    } else {
                        returnResult.setStatus("0");
                        returnResult.setMessage("创建秒杀订单失败");
                    }
                }
            } else {
                log.info("没有库存了 已经超卖");
                returnResult.setStatus("0");
                returnResult.setMessage("没有库存了，已经超卖");
                return returnResult;
            }

        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage());
        } finally {
        }
        return returnResult;
    }

    @Override
    public ReturnResult secKillOrderMQ(SeckillOrder seckillOrder) {
        String id = UUID.randomUUID().toString();
        CorrelationData correlationId = new CorrelationData(id);
        seckillOrder.setStatus("1");
        seckillOrder.setCreateTime(new Date());
        seckillOrder.setPayTime(new Date());
        seckillOrder.setMoney(new BigDecimal("5299"));
        seckillOrder.setSaleMoney(new BigDecimal("0"));
        seckillOrder.setSellerId(1);
        rabbitTemplate.convertAndSend("directExchangeSecKill", "zcw.secKill", seckillOrder, correlationId);
        return null;
    }

    @RabbitListener(queues = "queueSecKill")
    public synchronized void listenerSecKill(SeckillOrder seckillOrder) {
        long start = System.currentTimeMillis();
        log.info("监听到了参数:{}", JSON.toJSONString(seckillOrder));
        SeckillProduct seckillProduct = seckillProductMapper.selectByPrimaryKey(seckillOrder.getSeckillId());
        log.info("线程名称：" + Thread.currentThread().getName());
        if (Objects.nonNull(seckillProduct.getStockNum()) && seckillProduct.getStockNum() > 0) {
            SeckillProduct editSecKillProduct = new SeckillProduct();
            editSecKillProduct.setId(seckillProduct.getId());
            editSecKillProduct.setStockNum(seckillProduct.getStockNum() - 1);
            if (seckillProductMapper.updateByPrimaryKeySelective(editSecKillProduct) > 0) {
                seckillOrderMapper.insert(seckillOrder);
            }
        } else {
            log.info("已经超卖了");
        }
        long end = System.currentTimeMillis();
        log.info("总共消耗:{}ms", (end - start));
    }

    /**
     * 类似 开奖，当时不知道结果，后面才知道
     * 1、判断缓存中有没有秒杀商品、判断商品库存是否为0、判断用户是否已经秒杀
     * 2、库存大于0 redis库存减1，更新redis缓存
     * 3、判断库存等于0 循环redis生成用户订单，更新库存表为0
     *
     * @param seckillOrder
     * @return
     */
    @Transactional
    @Override
    public ReturnResult secKillRedis(SeckillOrder seckillOrder) {
        ReturnResult returnResult = new ReturnResult();
        //查看缓存有无此商品
        SeckillProduct seckillProduct = (SeckillProduct) redisUtil.getStr("SecKillProduct:" + seckillOrder.getSeckillId());
        log.info("输出库存:{}", seckillProduct.getStockNum());
        if (ObjectUtils.isEmpty(seckillProduct)) {
            returnResult.setStatus("0");
            returnResult.setMessage("没有此商品");
            return returnResult;
        }
        if (seckillProduct.getStockNum() == 0) {
            log.info("商品已经秒杀完");
            returnResult.setStatus("0");
            returnResult.setMessage("商品已经秒杀完");
            return returnResult;
        }
        //判断此人是否已经参加秒杀
        Object str = redisUtil.getStr("SecKillUser:" + seckillOrder.getUserId());
        if (!ObjectUtils.isEmpty(str)) {
            log.info(seckillOrder.getUserId() + "已经参加过秒杀");
            returnResult.setStatus("0");
            returnResult.setMessage(seckillOrder.getUserId() + "已经参加过秒杀");
            return returnResult;
        }
        if (seckillProduct.getStockNum() > 0) {
            //减少redis秒杀商品库存
            seckillProduct.setStockNum(seckillProduct.getStockNum() - 1);
            redisUtil.setStr("SecKillProduct:" + seckillProduct.getId(), seckillProduct);
            //保存秒杀用户信息
            redisUtil.setStr("SecKillUser:" + seckillOrder.getUserId(), seckillOrder);
            if (seckillProduct.getStockNum() == 0) {
                //将订单信息 写入数据库
                List list = redisUtil.likeStr("SecKillUser");
                for (Object o : list) {
                    log.info("输出订单信息:{}", JSON.toJSONString(o));
                    //创建秒杀订单
                    SeckillOrder str1 = (SeckillOrder) redisUtil.getStr(o.toString());
                    //createSecKillOrderRedis(str1);
                }
                //设置秒杀商品库存为0
                SeckillProduct editSecKillProduct = new SeckillProduct();
                editSecKillProduct.setId(seckillProduct.getId());
                editSecKillProduct.setStockNum(0);
                //seckillProductMapper.updateByPrimaryKeySelective(editSecKillProduct);
            }
        }
        return returnResult;
    }

    private int createSecKillOrderRedis(SeckillOrder seckillOrder) {
        seckillOrder.setStatus("1");
        seckillOrder.setCreateTime(new Date());
        seckillOrder.setPayTime(new Date());
        seckillOrder.setMoney(new BigDecimal("5299"));
        seckillOrder.setSaleMoney(new BigDecimal("0"));
        seckillOrder.setSellerId(1);
        return seckillOrderMapper.insert(seckillOrder);
    }

    @Override
    public ReturnResult getSecKillRedis() {
        ReturnResult returnResult = new ReturnResult();
        SeckillProductExample seckillProductExample = new SeckillProductExample();
        SeckillProductExample.Criteria criteria = seckillProductExample.createCriteria();
        //库存>0
        criteria.andStockNumGreaterThan(0);
        //秒杀开始时间 小于 当前时间
        criteria.andBeginTimeLessThanOrEqualTo(new Date());
        //秒杀结束时间 大于 当前时间
        criteria.andEndTimeGreaterThan(new Date());
        List<SeckillProduct> secKillProducts = seckillProductMapper.selectByExample(seckillProductExample);
        log.info("读取秒杀商品为:{}", JSON.toJSONString(secKillProducts));
        secKillProducts.forEach(secKill -> {
            redisUtil.setStr("SecKillProduct:" + secKill.getId(), secKill);
        });
        returnResult.setStatus("1");
        returnResult.setMessage("缓存成功");
        return returnResult;
    }

    /**
     * 秒杀 redis+rabbitMQ方案
     *
     * @param seckillOrder
     * @return
     */
    @Override
    public ReturnResult secKillRedisAndRabbitMQ(SeckillOrder seckillOrder) {
        ReturnResult returnResult = new ReturnResult();
        //1、获取redis中秒杀商品
        SeckillProduct seckillProduct = (SeckillProduct) redisUtil.getStr("SecKillProduct:" + seckillOrder.getSeckillId());
        if (Objects.isNull(seckillProduct)) {
            return returnResult.FAIL("无效的商品");
        }
        if (seckillProduct.getStockNum() <= 0) {
            return returnResult.FAIL("商品库存为0");
        }
        //5、判断订单是否已经满了
        List list = redisUtil.likeStr("SecKillUser");
        if (list.size() >= seckillProduct.getNum()) {
            log.info("订单满了，秒杀结束");
            return returnResult.FAIL("订单已经满了");
        }
        //3、更新redis库存-1
        seckillProduct.setStockNum(seckillProduct.getStockNum() - 1);
        redisUtil.setStr("SecKillProduct:" + seckillOrder.getSeckillId(), seckillProduct);

        //2、判断是否已经秒杀
        SeckillOrderExample seckillOrderExample = new SeckillOrderExample();
        SeckillOrderExample.Criteria criteria = seckillOrderExample.createCriteria();
        criteria.andSellerIdEqualTo(seckillOrder.getSeckillId());
        criteria.andUserIdEqualTo(seckillOrder.getUserId());
        List<SeckillOrder> secKillOrders = seckillOrderMapper.selectByExample(seckillOrderExample);
        if (CollectionUtils.isNotEmpty(secKillOrders)) {
            log.info("用户" + seckillOrder.getUserId() + "已经秒杀");
            return returnResult.FAIL("已经秒杀");
        }
        //4、推送rabbitMQ
        seckillOrder.setStatus("1");
        seckillOrder.setCreateTime(new Date());
        seckillOrder.setPayTime(new Date());
        seckillOrder.setMoney(new BigDecimal("5299"));
        seckillOrder.setSaleMoney(new BigDecimal("0"));
        seckillOrder.setSellerId(1);
        String id = UUID.randomUUID().toString();
        CorrelationData correlationId = new CorrelationData(id);
        rabbitTemplate.convertAndSend("directExchangeSecKill", "zcw.secKillRabbitMQAndRedis", seckillOrder, correlationId);

        return returnResult.SUCCESS("抢购中。。。");
    }

    @RabbitListener(queues = "queueSecKillRabbitAndRedis")
    public void listenerSecKillRedisAndRabbitMQ(SeckillOrder seckillOrder) {
        /*//1、获取redis中秒杀商品
        SeckillProduct secKillProductRedis = (SeckillProduct) redisUtil.getStr("SecKillProduct:" + seckillOrder.getSeckillId());
        if (secKillProductRedis.getStockNum() <= 0) {
            log.info("redis商品库存为0");
            return ;
        }*/
        //3、判断sql库存是否足够
        SeckillProduct seckillProduct = seckillProductMapper.selectByPrimaryKey(seckillOrder.getSeckillId());
        /*if (seckillProduct.getStockNum() <= 0) {
            log.info(seckillOrder.getSellerId() + "sql商品库存不足");
            return;
        }*/
        //todo 判断订单是否已经满了
        List list = redisUtil.likeStr("SecKillUser");
        if (list.size() >= seckillProduct.getNum()) {
            log.info("订单满了，秒杀结束");
            return;
        }
        //2、判断是否已经秒杀成功
        SeckillOrderExample seckillOrderExample = new SeckillOrderExample();
        SeckillOrderExample.Criteria criteria = seckillOrderExample.createCriteria();
        criteria.andSellerIdEqualTo(seckillOrder.getSeckillId());
        criteria.andUserIdEqualTo(seckillOrder.getUserId());
        List<SeckillOrder> secKillOrders = seckillOrderMapper.selectByExample(seckillOrderExample);
        if (CollectionUtils.isNotEmpty(secKillOrders)) {
            log.info("用户" + seckillOrder.getUserId() + "已经秒杀");
            return;
        }

        //4、判断订单是否超出库存
        /*SeckillOrderExample queryOrderExample = new SeckillOrderExample();
        SeckillOrderExample.Criteria criteria1 = queryOrderExample.createCriteria();
        criteria1.andSellerIdEqualTo(seckillOrder.getSeckillId());
        List<SeckillOrder> seckillOrders = seckillOrderMapper.selectByExample(queryOrderExample);
        if (seckillOrders.size() >= seckillProduct.getNum()) {
            log.info("订单已经超了");
            return;
        }*/
        //todo 收到mq后将订单信息保存到redis
        createOrderInRedis(seckillOrder, seckillProduct);
    }

    //假设status 0 时已经加过数据库
    @Transactional
    public void createOrderInRedis(SeckillOrder seckillOrder, SeckillProduct seckillProduct) {
        //将订单保存至redis
        redisUtil.setStr("SecKillUser:" + seckillOrder.getUserId(), seckillOrder);
        //查询redis订单
        List list = redisUtil.likeStr("SecKillUser");
        list.forEach(o -> {
            SeckillOrder addSecKillOrder = (SeckillOrder) redisUtil.getStr(o.toString());
            //假设status 0 时已经加过数据库
            if (addSecKillOrder.getStatus().equals("0")) {
                return;
            }
            log.info("输出订单信息:{}", JSON.toJSONString(o));
            log.info("sql当前库存为:{}", seckillProduct.getStockNum());
            /*
            //先更新数据库，再新增订单，会出现数据不一致情况
            int subtract = seckillProductMapper.updateByPrimaryKeySelective(editSecKillProduct);
            if (subtract > 0) {
                createSecKillOrderRedis(addSecKillOrder);
                addSecKillOrder.setStatus("0");
                redisUtil.setStr("SecKillUser:" + addSecKillOrder.getUserId(), addSecKillOrder);
            }*/
            //订单先去重，创建订单表并且更新redis库存
            if (createSecKillOrderRedis(addSecKillOrder) > 0) {
                addSecKillOrder.setStatus("0");
                redisUtil.setStr("SecKillUser:" + addSecKillOrder.getUserId(), addSecKillOrder);
            }
        });
        //读redis库存 更新库存表
        SeckillProduct seckillProduct1 = (SeckillProduct) redisUtil.getStr("SecKillProduct:" + seckillProduct.getId());
        log.info("输出商品缓存:{}", JSON.toJSONString(seckillProduct1));
        SeckillProduct editSecKillProduct = new SeckillProduct();
        editSecKillProduct.setId(seckillProduct1.getId());
        editSecKillProduct.setStockNum(seckillProduct1.getStockNum());
        seckillProductMapper.updateByPrimaryKeySelective(editSecKillProduct);
    }

    @Transactional
    public void createOrder(SeckillOrder seckillOrder, SeckillProduct seckillProduct) {
        SeckillProduct editSecKillProduct = new SeckillProduct();
        log.info("sql当前库存为:{}", seckillProduct.getStockNum());
        editSecKillProduct.setId(seckillProduct.getId());
        editSecKillProduct.setStockNum(seckillProduct.getStockNum() - 1);
        int subtract = seckillProductMapper.updateByPrimaryKeySelective(editSecKillProduct);
        log.info("库存更新成功否:{}", subtract);
        //更新sql库存
        if (subtract > 0) {
            //创建订单
            createSecKillOrderRedis(seckillOrder);
        } else {
            return;
        }
    }
}
