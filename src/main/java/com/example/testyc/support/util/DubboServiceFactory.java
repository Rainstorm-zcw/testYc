package com.example.testyc.support.util;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.utils.ReferenceConfigCache;
import com.alibaba.dubbo.rpc.service.GenericService;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author zcw
 * @date 2019-10-19
 * @apiNote dubbo服务代理
 */
@Slf4j
public class DubboServiceFactory {

    @Autowired
    private ApplicationConfig application;

    @Autowired
    private RegistryConfig registry;

    private static class SingletonHolder {
        private static DubboServiceFactory INSTANCE = new DubboServiceFactory();
    }

    private DubboServiceFactory() {
        Properties prop = new Properties();
        ClassLoader classLoader = DubboServiceFactory.class.getClassLoader();
        try {
            prop.load(classLoader.getResourceAsStream("application.yml"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(prop.getProperty("name"));
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(prop.getProperty("address"));
        this.application = applicationConfig;
        this.registry = registryConfig;
    }

    public static DubboServiceFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * 泛化调用
     *
     * @param serviceId      dubbo服务id
     * @param serviceGroup   dubbo组
     * @param version        服务版本号
     * @param interfaceClass 接口地址
     * @param methodName     方法名称
     * @param parameters
     * @return
     */
    public Object genericInvoke(String serviceId, String serviceGroup, String version, String interfaceClass, String methodName, List<Map<String, Object>> parameters) {

        ReferenceConfig<GenericService> reference = new ReferenceConfig<>();
        //服务名称
        reference.setApplication(application);
        //注册中心
        reference.setRegistry(registry);
        //接口名称
        reference.setInterface(interfaceClass);
        reference.setId(serviceId);
        //reference.setId("ycOutputQueryApi");
        //声明为泛化接口
        reference.setGeneric(true);
        //reference.setGroup("yc_wl_service_dev");
        reference.setGroup(ObjectUtils.getDisplayString(serviceGroup));
        //reference.setVersion("0.0.1");
        reference.setVersion(ObjectUtils.getDisplayString(version));
        log.info("输出dubbo:{}", reference);
        //ReferenceConfig实例很重，封装了与注册中心的连接以及与提供者的连接，
        //需要缓存，否则重复生成ReferenceConfig可能造成性能问题并且会有内存和连接泄漏。
        //API方式编程时，容易忽略此问题。
        //这里使用dubbo内置的简单缓存工具类进行缓存
        ReferenceConfigCache cache = ReferenceConfigCache.getCache();
        GenericService genericService = cache.get(reference);
        int len = parameters.size();
        String[] invokeParamTypes = new String[len];
        Object[] invokeParams = new Object[len];
        for (int i = 0; i < len; i++) {
            invokeParamTypes[i] = parameters.get(i).get("paramTypes") + "";
            invokeParams[i] = parameters.get(i).get("Object");
        }
        /*String[] parameterTypes = new String[]{"com.ouyeel.wl.servicecenter.yc.api.ycputout.command.QueryYcCompanyCommand"};
        Map<String, Object> mapParam = Maps.newHashMap();

        mapParam.put("class", "com.ouyeel.wl.servicecenter.yc.api.ycputout.command.QueryYcCompanyCommand");
        mapParam.put("pageSize", 10);
        mapParam.put("pageNum", 1);
        Object[] mapParams = new Object[]{mapParam};
        log.info("输出1:{}", invokeParams);
        log.info("输出2:{}", mapParams);*/
        return genericService.$invoke(methodName, invokeParamTypes, invokeParams);

    }

}
