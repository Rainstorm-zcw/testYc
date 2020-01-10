package com.example.testyc.util;


import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Slf4j
@Component
public class RabbitMQListener {

    /**
     * 如果有两个接收程序用了各自的queue，但使用相同的routingKey去绑定direct exchange的话，
     * 分发的行为是复制的，也就是说每个程序都会收到这个消息的副本。行为相当于fanout类型的exchange
     */
    @RabbitListener(queues = "zcwQueue")
    public void listener(String val, Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) long tag) {
        log.info("输出监听内容，复制1:{}", val);
        /*try {
            channel.basicAck(tag, false);
        } catch (Exception ex) {
            log.error("异常:{}", ex);
        }*/
    }

    @RabbitListener(queues = "abcQueue")
    public void listener2(String val, Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) long tag) {
        log.info("输出监听内容，复制2:{}", val);
        /*try {
            channel.basicAck(tag, false);
        } catch (Exception ex) {
            log.error("异常:{}", ex);
        }*/
    }

    /**
     * 如果有两个接收程序都是用了同一个的queue和相同的routingKey去绑定direct exchange的话，
     * 分发的行为是负载均衡的，也就是说第一个是程序1收到，第二个是程序2收到，以此类推
     */
    @RabbitListener(queues = "same")
    public void sameA(String val) {
        log.info("负载均衡A:{}", val);
    }

    @RabbitListener(queues = "same")
    public void sameB(String val) {
        log.info("负载均衡B:{}", val);
    }

    @RabbitListener(queues = "topic.message")
    public void topicListener1(String val) {
        log.info("topic1 监听内容为:{}", val);
    }

    @RabbitListener(queues = "topic.messages")
    public void topicListener2(String val) {
        log.info("topic2 监听内容为:{}", val);
    }


    @RabbitListener(queues = "fanout.A")
    public void processA(String val) {
        log.info("fanoutA 监听内容为:{}", val);
    }

    @RabbitListener(queues = "fanout.B")
    public void processB(String val) {
        log.info("fanoutB 监听内容为:{}", val);
    }

    @RabbitListener(queues = "fanout.C")
    public void processC(String val) {
        log.info("fanoutC 监听内容为:{}", val);
    }


    /**
     * 监听替补队列 来验证死信.
     *
     * @param message the message
     * @param channel the channel
     * @throws IOException the io exception  这里异常需要处理
     */
    @RabbitListener(queues = "REDIRECT_QUEUE")
    @RabbitHandler
    public void redirect(Message message, Channel channel) throws IOException {
        try {
            Thread.sleep(5*1000);
        }catch (Exception ex){}
        channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
        log.info("dead message  10s 后 消费消息 :" + new String(message.getBody()));
    }
}
