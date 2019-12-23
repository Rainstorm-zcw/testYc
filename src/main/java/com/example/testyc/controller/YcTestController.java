package com.example.testyc.controller;

import com.alibaba.fastjson.JSON;
import com.example.testyc.persistence.entity.TWlStoreInfo;
import com.example.testyc.persistence.entity.TWlStoreInfoExample;
import com.example.testyc.persistence.mapper.TWlStoreInfoMapper;
import com.example.testyc.support.annotation.OuyeelApi;
import com.example.testyc.support.command.RequestCommand;
import com.example.testyc.support.util.DubboServiceFactory;
import com.example.testyc.util.EhcacheConfig;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author zcw
 * @date 2019-09-24
 */
@Slf4j
@OuyeelApi
@RestController
@RequestMapping("/yc")
@Api(tags = "云仓测试接口")
public class YcTestController {

    @Value("${application.name}")
    private String applicationName;

    @Value("${registry.address}")
    private String registryAddress;

    @Autowired(required = false)
    private TWlStoreInfoMapper mapper;

    @Autowired
    private EhcacheConfig ehcacheConfig;

    /**
     * 测试结果
     */
    @RequestMapping(value = "testYC", method = RequestMethod.POST)
    @ApiOperation("测试云仓接口")
    @ResponseBody
    public Object testYC(@RequestBody RequestCommand dto) {
        log.info("输出入参结果:{}", JSON.toJSONString(dto));
        Map map = Maps.newHashMap();
        Map<String, Object> mapParam = Maps.newHashMap();
        mapParam.put("pageSize", 10);
        mapParam.put("pageNum", 1);
        //后端接口参数类型
        map.put("paramTypes", "com.ouyeel.wl.servicecenter.yc.api.ycputout.command.QueryYcCompanyCommand");
        //用以调用后端接口的实参
        map.put("Object", mapParam);
        List<Map<String, Object>> paramInfos = Lists.newArrayList();
        for (Map maps : dto.getMethodParams()) {
            paramInfos.add(maps);
        }
        log.info("输出结果一:{}", JSON.toJSONString(map));
        log.info("输出结果二:{}", JSON.toJSONString(dto.getMethodParams()));
        DubboServiceFactory dubbo = DubboServiceFactory.getInstance();

        return dubbo.genericInvoke(dto.getServiceId(), dto.getServiceGroup(), dto.getVersion(), dto.getInterfaceName(), dto.getMethodName(), paramInfos);
    }

    @RequestMapping(value = "queryStoreInfo", method = RequestMethod.POST)
    @ApiOperation("查询仓库信息")
    @ResponseBody
    public List<TWlStoreInfo> queryStoreInfo(String guid, String storeName) {
        TWlStoreInfoExample infoExample = new TWlStoreInfoExample();
        TWlStoreInfoExample.Criteria criteria = infoExample.createCriteria();
        criteria.andGuidEqualTo(guid);
        criteria.andStoreNameEqualTo(storeName);
        List<TWlStoreInfo> storeInfo = mapper.selectByExample(infoExample);
        log.info("仓库信息为:{}", JSON.toJSONString(storeInfo));
        return storeInfo;
    }

    @RequestMapping(value = "testCache", method = RequestMethod.POST)
    @ApiOperation("测试缓存")
    public void testCache() {
        String cacheName = "myCache";
        String key = "13337106951";
        String val = "测试手机号";
        ehcacheConfig.save(cacheName, key, val);
        Object object = ehcacheConfig.get(cacheName, key);
        log.info("输出缓存:{}", object.toString());
        ehcacheConfig.remove(cacheName, key);
        Object object2 = ehcacheConfig.get(cacheName, key);
        log.info("输出缓存:{}", object2);
    }

    //todo 要注意的是当一个支持缓存的方法在对象内部被调用时是不会触发缓存功能的。
    @RequestMapping(value = "testCache2", method = RequestMethod.POST)
    @ApiOperation("测试缓存2")
    public void testCache2() {
        /*String cacheName = "myCache";
        String key = "13337106951";
        String val = "注解缓存测试";
        ehcacheConfig.annotationSave(key, val);
        Object object = ehcacheConfig.get(cacheName, key);
        log.info("输出缓存:{}", object.toString());
        ehcacheConfig.annotationRemove(key);
        Object object2 = ehcacheConfig.get(cacheName, key);
        log.info("输出缓存:{}", object2);*/
        String cacheName = "myCache";
        String key = "18989898988";
        String val = "I'm ironMan";
        Object object = ehcacheConfig.testSave(key, val);
        log.info("输出缓存:{}", object.toString());
        val = "注解缓存测试";
        //ehcacheConfig.annotationSave(key, val);
        //ehcacheConfig.annotationRemove(key);
        Object object2 = ehcacheConfig.cacheIng(key, "注解缓存测试");
        log.info("输出缓存:{}", object2);
    }



}
