package com.example.testyc;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.utils.ReferenceConfigCache;
import com.alibaba.dubbo.rpc.service.GenericService;
import com.example.testyc.util.EhcacheConfig;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;


@Slf4j
@SpringBootTest
class TestYcApplicationTests {

    @Autowired
    private EhcacheConfig ehcacheConfig;

    private Logger logger = LoggerFactory.getLogger(TestYcApplicationTests.class);

    @Test
    void contextLoads() {
        int num = 02362;
        int count = 1;
        while (true) {
            num = num / 10;
            count++;
            if (num < 10) {
                break;
            }
        }
        logger.info("测试:{}", count);
    }

    @Test
    void decimalTest() {
        double value = 30314905.14142;
        /**
         * 强制转换为int
         */
        int num = (int) value;
        logger.info("输出转换结果:{}", num);
        int count = 1;
        while (true) {
            num = num / 10;
            count++;
            if (num < 10) {
                break;
            }
        }
        logger.info("输出位数：{}", count);
    }

    @Test
    void testDubbo() {
        ApplicationConfig application = new ApplicationConfig();
        application.setName("testHy");
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");
        ReferenceConfig<GenericService> rc = new ReferenceConfig<>();
        rc.setApplication(application);
        rc.setGeneric(true);
        rc.setInterface("com.ouyeel.wl.servicecenter.yc.api.ycputout.YcOutputQueryApi");
        rc.setId("ycOutputQueryApi");
        rc.setGroup("yc_wl_service_dev");
        rc.setRegistry(registryConfig);
        logger.info("输出配置信息:{}", rc);

        ReferenceConfigCache cache = ReferenceConfigCache.getCache();
        GenericService genericService = cache.get(rc);

        Map map = Maps.newHashMap();
        map.put("pageNum", 1);
        map.put("pageSize", 10);
        Object result = genericService.$invoke("queryAllCompany", new String[]{""}, new Object[]{map});

        logger.info("输出结果:{}", result);

    }

    @Test
    public void testCache() {
        String cacheName = "myCache";
        String key = "13333333333";
        String val = "测试缓存";
        //保存缓存
        ehcacheConfig.save(cacheName, key, val);
        //获取缓存
        Object object = ehcacheConfig.get(cacheName, key);
        log.info("输出缓存:{}", object.toString());
        //删除缓存
        ehcacheConfig.remove(cacheName, key);
        //获取缓存
        Object object2 = ehcacheConfig.get(cacheName, key);
        log.info("重新输出缓存:{}", object2);
    }

    @Test
    public void testAnnotationCache() {
        String key = "18888888888";
        String val = "注解方式测试缓存";
        //保存缓存
        ehcacheConfig.annotationSave(key, val);
        //获取缓存
        Object object = ehcacheConfig.cacheIng(key, val);
        log.info("注解方式输出缓存:{}", object.toString());
        //删除缓存
        ehcacheConfig.annotationRemove(key);
        //获取缓存
        Object object2 = ehcacheConfig.get("myCache", key);
        log.info("注解方式重新输出缓存:{}", object2);
    }

}
