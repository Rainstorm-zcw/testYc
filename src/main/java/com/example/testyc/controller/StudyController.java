package com.example.testyc.controller;

import com.example.testyc.persistence.entity.SeckillOrder;
import com.example.testyc.persistence.vo.ReturnResult;
import com.example.testyc.persistence.vo.SecKillCommand;
import com.example.testyc.service.SecKillOrderService;
import com.example.testyc.support.annotation.StudyInfoApi;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


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


}
