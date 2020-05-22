package com.example.testyc.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author zcw
 * @date 2020-03-01
 * @apiNote redis工具类
 */
@Slf4j
@Component
public class RedisUtil {

    @Autowired
    private RedisTemplate redisTemplate;


    /**
     * redis序列化设置-防止redis工具中文乱码
     *
     * @param redisTemplate redis模板
     */
    @Resource
    public void setRedisTemplate(RedisTemplate redisTemplate) {
        RedisSerializer stringSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(stringSerializer);
        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        redisTemplate.setHashKeySerializer(stringSerializer);
        redisTemplate.setHashValueSerializer(stringSerializer);
        this.redisTemplate = redisTemplate;
    }

    /**
     * 超时时间
     */
    private final static long SECONDS = (60);

    public void setStr(String key, Object value) {
        redisTemplate.opsForValue().set(key, value, SECONDS, TimeUnit.SECONDS);
//        redisTemplate.opsForValue().setIfPresent();

    }

    public Object getStr(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    public void delStr(String key){
        redisTemplate.delete(key);
    }
}
