package com.example.testyc.controller;

import com.example.testyc.support.annotation.OuyeelApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    @ApiOperation("云仓测试1")
    public String ycTest() {
        log.info("打印");
        log.error("错误");
        log.debug("哈哈");
        return "hello";
    }

    @RequestMapping(value = "test", method = RequestMethod.GET)
    @ApiOperation("云仓测试2")
    public void ycTest2() {
        log.info("打印");
        log.error("错误");
        log.debug("哈哈");
    }
}
