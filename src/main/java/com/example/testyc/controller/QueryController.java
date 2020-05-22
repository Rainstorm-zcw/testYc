package com.example.testyc.controller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("query")
public class QueryController {

    @GetMapping(value = "testGet")
    @ResponseBody
    public String testGet(HttpServletRequest request){
        String [] value = request.getParameterValues("value");
        String manyValue = request.getParameter("value");
        String[]  values = request.getParameterMap().get("value");
        log.info("输出结果:{}", JSON.toJSONString(value));
        log.info("输出结果2222:{}", manyValue);
        log.info("输出结果3333:{}", JSON.toJSONString(values));


        return value.toString();
    }
}
