package com.example.testyc.controller;

import com.example.testyc.support.annotation.RabbitMQApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author zcw
 * @date 2019-12-30
 */
@Slf4j
@RabbitMQApi
@RestController
@RequestMapping("rabbitMQ")
@Api(tags = "rabbitMQ实例")
public class RabbitController {


    @Autowired
    private RabbitTemplate rabbitTemplate;


    @GetMapping(value = "direct")
    @ApiOperation(value = "direct", notes = "rabbitMQ direct(直连)模式")
    public void direct() {
        log.info("direct 模式");
        rabbitTemplate.convertAndSend("directExchange", "direct.zcw", "同一个routingKey、不同的queue");
    }

    @GetMapping(value = "same")
    @ApiOperation(value = "direct", notes = "rabbitMQ direct (直连) 相同的路由和队列模式")
    public void same() {
        log.info("direct 模式");
        rabbitTemplate.convertAndSend("sameExchange", "zcw.same", "相同的queue和相同的routingKey");
    }

    @GetMapping(value = "topic")
    @ApiOperation(value = "topic", notes = "rabbitMQ topic(话题)模糊匹配模式")
    public void topic() {
        log.info("topic 模式");
        rabbitTemplate.convertAndSend("topicExchange", "topic.message", "你好呀1111");
        rabbitTemplate.convertAndSend("topicExchange", "topic.messages", "你好呀2222");
    }

    @GetMapping(value = "fanout")
    @ApiOperation(value = "fanout", notes = "rabbitMQ fanout(广播)模式")
    public void fanout() {
        log.info("fanout 模式");
        rabbitTemplate.convertAndSend("fanoutExchange", "", "广播模式");
    }
}
