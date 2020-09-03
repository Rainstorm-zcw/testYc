package com.example.testyc.service;

import com.example.testyc.persistence.entity.SeckillOrder;
import com.example.testyc.persistence.vo.ReturnResult;

/**
 * @author zcw
 * @date 2020-07-30 21:23:54
 * @apiNote 秒杀服务接口
 */
public interface SecKillOrderService {

    /**
     * 創建秒殺訂單
     *
     * @param seckillOrder 秒杀订单
     * @return 返回结果
     */
    ReturnResult createSecKillOrder(SeckillOrder seckillOrder);

    /**
     * 秒杀加上mq
     *
     * @param seckillOrder
     * @return
     */
    ReturnResult secKillOrderMQ(SeckillOrder seckillOrder);

    /**
     * 秒杀 超卖情况 加上redis
     *
     * @param seckillOrder
     * @return
     */
    ReturnResult secKillRedis(SeckillOrder seckillOrder);

    /**
     * 获取全部秒杀商品
     *
     * @return
     */
    ReturnResult getSecKillRedis();

    /**
     * 秒杀 redis+rabbitMQ方案
     *
     * @param seckillOrder
     * @return
     */
    ReturnResult secKillRedisAndRabbitMQ(SeckillOrder seckillOrder);

    void atomicIntegerExecute();

    void semaphoreExecute();

}
