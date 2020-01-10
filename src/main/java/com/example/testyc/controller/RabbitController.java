package com.example.testyc.controller;

import com.example.testyc.support.annotation.RabbitMQApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


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
    @ApiOperation(value = "direct 直连", notes = "rabbitMQ direct(直连)模式")
    public void direct() {
        log.info("direct 模式");
        String id = UUID.randomUUID().toString();
        CorrelationData correlationId = new CorrelationData(id);
        rabbitTemplate.convertAndSend("directExchange", "direct.zcw", "同一个routingKey、不同的queue", correlationId);
    }

    @GetMapping(value = "same")
    @ApiOperation(value = "direct 直连 key、queue相同", notes = "rabbitMQ direct (直连) 相同的路由和队列模式")
    public void same() {
        log.info("direct 模式");
        rabbitTemplate.convertAndSend("sameExchange", "zcw.same", "相同的queue和相同的routingKey");
    }

    @GetMapping(value = "topic")
    @ApiOperation(value = "topic 话题模式", notes = "rabbitMQ topic(话题)模糊匹配模式")
    public void topic() {
        log.info("topic 模式");
        rabbitTemplate.convertAndSend("topicExchange", "topic.message", "你好呀1111");
        rabbitTemplate.convertAndSend("topicExchange", "topic.messages", "你好呀2222");
    }

    @GetMapping(value = "fanout")
    @ApiOperation(value = "fanout 广播模式", notes = "rabbitMQ fanout(广播)模式")
    public void fanout() {
        log.info("fanout 模式");
        rabbitTemplate.convertAndSend("fanoutExchange", "", "广播模式");
    }

    @GetMapping(value = "deadLetter")
    @ApiOperation(value = "死信队列", notes = "deadLetter 死信队列")
    public ResponseEntity deadLetter() {
        CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());
        // 声明消息处理器 这个对消息进行处理 可以设置一些参数 对消息进行一些定制化处理 我们这里 来设置消息的编码 以及消息的过期时间
        // 因为在.net 以及其他版本过期时间不一致 这里的时间毫秒值 为字符串
        MessagePostProcessor messagePostProcessor = message -> {
            MessageProperties messageProperties = message.getMessageProperties();
            //设置编码
            messageProperties.setContentEncoding("utf-8");
            //设置过期时间10*1000毫秒
            messageProperties.setExpiration("10000");
            return message;
        };
        String p = "测试死信队列";
        rabbitTemplate.convertAndSend("DL_EXCHANGE", "DL_KEY", p, messagePostProcessor, correlationData);
        return ResponseEntity.ok().build();
    }
}
