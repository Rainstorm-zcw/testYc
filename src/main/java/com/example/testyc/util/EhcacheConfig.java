package com.example.testyc.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author zcw
 * @date 2019-12-17
 * @description ehcache
 */
@Service
public class EhcacheConfig {

    private static Logger logger = LoggerFactory.getLogger(EhcacheConfig.class);

    /**
     * 注入cacheManager，cacheManager是缓存管理器，管理各种缓存（cache）组件
     */
    @Autowired
    private CacheManager cacheManager;

    /**
     * 缓存数据
     *
     * @param cacheName 缓存域名称
     * @param key       缓存键
     * @param obj       缓存值
     * @return
     */
    public String save(String cacheName, String key, Object obj) {
        Cache cache = cacheManager.getCache(cacheName);
        cache.put(key, obj);
        return "success";
    }

    /**
     * 获取缓存
     *
     * @param cacheName 缓存域名称
     * @param key       缓存键
     * @return
     */
    public String get(String cacheName, String key) {
        Cache cache = cacheManager.getCache(cacheName);
        return cache.get(key, String.class);
    }

    /**
     * 移除缓存
     *
     * @param cacheName 缓存域名称
     * @param key       缓存键
     */
    public void remove(String cacheName, String key) {
        Cache cache = cacheManager.getCache(cacheName);
        logger.info("删除缓存键值:" + key);
        cache.evict(key);
    }

    /**
     * （注解式）存入缓存，如果已经存在key，则会覆盖key对应的val
     *
     * @param key 缓存键
     * @param val 缓存值
     * @return
     */
    @CachePut(key = "#key", value = "myCache")
    public String annotationSave(String key, String val) {
        return val;
    }

    /**
     * （注解式）移除缓存
     *
     * @param key 缓存键
     */
    @CacheEvict(value = "myCache", key = "#key")
    public void annotationRemove(String key) {
        logger.info("移除了缓存:" + key);
    }

    /**
     * （注解式）存入缓存，如果已经存在key，会直接把key的val返回
     *
     * @param key
     * @param val
     * @return
     */
    @Cacheable(key = "#key", value = "myCache")
    public String cacheIng(String key, String val) {
        return val;
    }

    public String testSave(String key, String val) {
        this.annotationSave(key, val);
        Object object = get("myCache", key);
        return "";
    }
}
