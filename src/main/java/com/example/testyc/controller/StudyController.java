package com.example.testyc.controller;

import com.alibaba.fastjson.JSON;
import com.example.testyc.persistence.entity.SeckillOrder;
import com.example.testyc.persistence.entity.ValidBeanTest;
import com.example.testyc.persistence.vo.ReturnResult;
import com.example.testyc.persistence.vo.SecKillCommand;
import com.example.testyc.service.SecKillOrderService;
import com.example.testyc.support.annotation.StudyInfoApi;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


/**
 * @author zcw
 * @date 2019-12-30
 */
@Slf4j
@StudyInfoApi
@RestController
@RequestMapping("study")
@Api(tags = "模拟超卖、秒杀、高并发")
public class StudyController {

    @Resource
    SecKillOrderService secKillOrderService;

    /**
     * 1、不加缓存 只加同步synchronized 测试并发情况下是否超卖
     * 结果会发生超卖现象 测试 10000线程 库存100 超卖5件商品
     *
     * @param secKillCommand
     * @return
     */
    @PostMapping(value = "secKillProduct")
    @ApiOperation("秒杀商品 普通方案")
    public ReturnResult secKillProduct(@ApiParam SecKillCommand secKillCommand) {
        SeckillOrder seckillOrder = new SeckillOrder();
        BeanUtils.copyProperties(secKillCommand, seckillOrder);
        seckillOrder.setUserId(RandomUtils.nextInt());
        seckillOrder.setAddressId(seckillOrder.getUserId());
        seckillOrder.setSeckillId(1);
        return secKillOrderService.createSecKillOrder(seckillOrder);
    }

    /**
     * 2、RabbitMQ配合synchronized 未发现超卖情况
     * 1000-20000线程 库存3-100 未发现超卖
     *
     * @param secKillCommand
     * @return
     */
    @PostMapping("secKillMQ")
    @ApiOperation("秒杀商品 mq方案")
    public ReturnResult secKillMQ(@ApiParam SecKillCommand secKillCommand) {
        SeckillOrder seckillOrder = new SeckillOrder();
        BeanUtils.copyProperties(secKillCommand, seckillOrder);
        seckillOrder.setUserId(RandomUtils.nextInt());
        seckillOrder.setAddressId(seckillOrder.getUserId());
        seckillOrder.setSeckillId(1);
        return secKillOrderService.secKillOrderMQ(seckillOrder);
    }

    /**
     * 3、秒杀 redis方案
     *
     * @return
     */
    @PostMapping("secKillRedis")
    @ApiOperation("秒杀商品 redis方案")
    public ReturnResult secKillRedis(@ApiParam SecKillCommand secKillCommand) {
        SeckillOrder seckillOrder = new SeckillOrder();
        BeanUtils.copyProperties(secKillCommand, seckillOrder);
        seckillOrder.setUserId(RandomUtils.nextInt());
        seckillOrder.setAddressId(seckillOrder.getUserId());
        seckillOrder.setSeckillId(1);
        return secKillOrderService.secKillRedis(seckillOrder);
    }

    @GetMapping("setSecKillRedis")
    @ApiOperation("设置缓存秒杀商品")
    public ReturnResult getSecKillRedis() {
        return secKillOrderService.getSecKillRedis();
    }

    /**
     * 4、秒杀 redis+rabbitMQ方案
     *
     * @param secKillCommand
     * @return
     */
    @PostMapping("secKillRedisAndRabbitMQ")
    @ApiOperation("秒杀 redis+rabbitMQ方案")
    public ReturnResult secKillRedisAndRabbitMQ(@ApiParam SecKillCommand secKillCommand) {
        SeckillOrder seckillOrder = new SeckillOrder();
        BeanUtils.copyProperties(secKillCommand, seckillOrder);
        seckillOrder.setUserId(RandomUtils.nextInt());
        seckillOrder.setAddressId(seckillOrder.getUserId());
        seckillOrder.setSeckillId(1);
        return secKillOrderService.secKillRedisAndRabbitMQ(seckillOrder);
    }

    @GetMapping("atomicExecute")
    @ApiOperation("限流atomic方式")
    public void atomicExecute(){
        secKillOrderService.atomicIntegerExecute();
    }

    @GetMapping("semaphoreExecute")
    @ApiOperation("限流semaphore方式")
    public void semaphoreExecute(){
        secKillOrderService.semaphoreExecute();
    }


    @PostMapping
    @ApiOperation("valid校验bean")
    @ResponseBody
    public String validBeanTest(@Valid  ValidBeanTest validBeanTest){
        try {
            log.info("输出校验bean:{}", JSON.toJSONString(validBeanTest));
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return JSON.toJSONString(validBeanTest);
    }


    /**
     * 使用线程池的优点
     * 1、重用线程池的线程，避免因为线程的创建和销毁锁带来的性能开销
     * 2、有效控制线程池的最大并发数，避免大量的线程之间因抢占系统资源而阻塞
     * 3、能够对线程进行简单的管理，并提供一下特定的操作如：可以提供定时、定期、单线程、并发数控制等功能
     */
    @GetMapping("newCachedThreadPool")
    @ApiOperation("newCachedThreadPool线程池")
    public void newCachedThreadPool(){
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            final int index = i;
            try {
                Thread.sleep(2000);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    log.info("第{}个线程{}", index, Thread.currentThread().getName());
                }
            });
        }
    }

    @GetMapping("newFixedThreadPool")
    @ApiOperation("newFixedThreadPool线程池")
    public void newFixedThreadPool() {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            final int index = i;
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    log.info("时间是{},第{}个线程{}", System.currentTimeMillis(), index + 1, Thread.currentThread().getName());
                    try {
                        Thread.sleep(2000);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });
        }
    }

    @GetMapping("scheduledThreadPool")
    @ApiOperation("scheduledThreadPool线程池/延迟执行代码")
    public void scheduledThreadPool(){
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(3);
        log.info("当前时间:{}", System.currentTimeMillis());
        scheduledThreadPool.schedule(new Runnable() {
            @Override
            public void run() {
                log.info("现在时间:{}", System.currentTimeMillis());
            }
        }, 4, TimeUnit.SECONDS);//延迟4秒后执行
    }

    @GetMapping("scheduledThreadPoolAtFixedRate")
    @ApiOperation("scheduledThreadPool线程池/定期执行代码")
    public void scheduledThreadPoolAtFixedRate(){
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(3);
        log.info("开始时间:{}", System.currentTimeMillis());
        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                log.info("现在时间:{}", System.currentTimeMillis());
            }
        }, 2, 3, TimeUnit.SECONDS);//设置延迟2秒后每3秒执行一次
    }

    @GetMapping("newSingleThreadPool")
    @ApiOperation("newSingleThreadPool线程池")
    public void newSingleThreadPool(){
        ExecutorService newSingleThreadPool = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 7; i++) {
            final int indexs = i;
            log.info("输出i:{}", i);
            newSingleThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    log.info("现在时间：{}第{}个线程", System.currentTimeMillis(), indexs);
                    try {
                        Thread.sleep(2000);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
            }
            });
        }
    }

}
