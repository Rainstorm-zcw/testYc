package com.example.testyc.util;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;
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
    private final static long SECONDS = (60*60);

    public void setStr(String key, Object value) {
        redisTemplate.opsForValue().set(key, value, SECONDS, TimeUnit.SECONDS);
        redisTemplate.boundHashOps("").getKey();
//        redisTemplate.opsForValue().setIfPresent();

    }

    public List likeStr(String key){
        Set keys = redisTemplate.keys(key + "*");
        List list = Lists.newArrayList(keys);
        return list;
    }

    public Object getStr(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    public void delStr(String key){
        redisTemplate.delete(key);
    }

    public void setNx(String key){
        //redisTemplate.watch();
    }
}
