package com.example.testyc.controller;

import com.alibaba.fastjson.JSON;
import com.example.testyc.support.annotation.OuyeelApi;
import com.example.testyc.support.command.RequestCommand;
import com.example.testyc.support.util.DubboServiceFactory;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author zcw
 * @date 2020-01-10
 * @description 会员测试类
 */
@Slf4j
@OuyeelApi
@RestController
@RequestMapping("/hy")
@Api(tags = "会员测试接口")
public class HyTestController {
    /**
     * 测试结果
     */
    @RequestMapping(value = "testHY", method = RequestMethod.POST)
    @ApiOperation("测试云仓接口")
    @ResponseBody
    public Object testHY(@RequestBody RequestCommand dto) {
        log.info("输出入参结果:{}", JSON.toJSONString(dto));
        Map<String, Object> mapParam = Maps.newHashMap();
        mapParam.put("pageSize", 10);
        mapParam.put("pageNum", 1);
        //后端接口参数类型
        //用以调用后端接口的实参
        List<Map<String, Object>> paramInfos = Lists.newArrayList();
        for (Map maps : dto.getMethodParams()) {
            paramInfos.add(maps);
        }
        log.info("输出结果二:{}", JSON.toJSONString(dto.getMethodParams()));
        DubboServiceFactory dubbo = DubboServiceFactory.getInstance();

        return dubbo.genericInvoke(dto.getServiceId(), dto.getServiceGroup(), dto.getVersion(), dto.getInterfaceName(), dto.getMethodName(), paramInfos);
    }

}
