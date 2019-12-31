package com.example.testyc.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zcw
 * @date 2019-12-26
 * @description rabbitMQ配置
 */
@Configuration
public class RabbitMQConfig {

    private static final Logger logger = LoggerFactory.getLogger(RabbitMQConfig.class);

    /*@Autowired
    private CachingConnectionFactory connectionFactory;
    @Bean
    public RabbitTemplate rabbitTemplate() {
        connectionFactory.setPublisherConfirms(true);
        connectionFactory.setPublisherReturns(true);
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMandatory(true);
        rabbitTemplate.setConfirmCallback(new RabbitTemplate.ConfirmCallback() {
            @Override
            public void confirm(CorrelationData correlationData, boolean ack, String cause) {
                logger.info("消息发送成功：correlationData({}),ack({}),cause({})", correlationData, ack, cause);
            }
        });
        rabbitTemplate.setReturnCallback(new RabbitTemplate.ReturnCallback() {
            @Override
            public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String rotingKey) {
                logger.info("消息丢失：exchange({}),route({}),replyCode({}),replyText({}),message:{}", exchange, rotingKey, replyCode, replyText, message);
            }
        });
        return rabbitTemplate;
    }*/

    /**
     * 如果有两个接收程序用了各自的queue，但使用相同的routingKey去绑定direct exchange的话，
     * 分发的行为是复制的，也就是说每个程序都会收到这个消息的副本。行为相当于fanout类型的exchange
     */
    @Bean(name = "queueZcw")
    public Queue queueZcw() {
        return new Queue("zcwQueue");
    }

    @Bean(name = "queueAbc")
    public Queue queueAbc() {
        return new Queue("abcQueue");
    }

    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange("directExchange");
    }

    @Bean
    public Binding bindZcw(@Qualifier(value = "queueZcw") Queue queueZcw, @Qualifier(value = "directExchange") DirectExchange exchange) {
        return BindingBuilder.bind(queueZcw).to(exchange).with("direct.zcw");
    }

    @Bean
    public Binding bindAbc(@Qualifier(value = "queueAbc") Queue queueAbc, @Qualifier(value = "directExchange") DirectExchange exchange) {
        return BindingBuilder.bind(queueAbc).to(exchange).with("direct.zcw");
    }

    /**
     * 如果有两个接收程序都是用了同一个的queue和相同的routingKey去绑定direct exchange的话，
     * 分发的行为是负载均衡的，也就是说第一个是程序1收到，第二个是程序2收到，以此类推
     * 根据concurrency做决定
     */
    @Bean
    public Queue sameA() {
        return new Queue("same");
    }

    @Bean
    public DirectExchange directExchangeA() {
        return new DirectExchange("sameExchange");
    }

    @Bean
    public Binding bindSameA(@Qualifier(value = "sameA") Queue queue, @Qualifier("directExchangeA") DirectExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with("zcw.same");
    }

    @Bean
    public Queue sameB() {
        return new Queue("same");
    }

    @Bean
    public Binding bindSameB(@Qualifier(value = "sameB") Queue queue, @Qualifier("directExchangeA") DirectExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with("zcw.same");
    }


    /**
     * topic exchange
     */
    @Bean(name = "message")
    public Queue queueMessage() {
        return new Queue("topic.message");
    }

    @Bean(name = "messages")
    public Queue queueMessages() {
        return new Queue("topic.messages");
    }

    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange("topicExchange");
    }

    @Bean
    public Binding bindingTopicExchangeMessage(@Qualifier(value = "message") Queue queueMessage, TopicExchange topicExchange) {
        return BindingBuilder.bind(queueMessage).to(topicExchange).with("topic.message");
    }

    @Bean
    public Binding bindingTopicExchangeMessages(@Qualifier(value = "messages") Queue queueMessages, TopicExchange topicExchange) {
        /**
         * #表示0个或多个词，*表示1个词
         */
        return BindingBuilder.bind(queueMessages).to(topicExchange).with("topic.#");
    }


    /**
     * fanout exchange
     */

    @Bean(name = "AMessage")
    public Queue AMessage() {
        return new Queue("fanout.A");
    }

    @Bean(name = "BMessage")
    public Queue BMessage() {
        return new Queue("fanout.B");
    }

    @Bean(name = "CMessage")
    public Queue CMessage() {
        return new Queue("fanout.C");
    }

    /**
     * 配置广播路由器
     *
     * @return
     */
    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange("fanoutExchange");
    }

    @Bean
    public Binding bindingFanoutExchangeA(@Qualifier("AMessage") Queue AMessage, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(AMessage).to(fanoutExchange);
    }

    @Bean
    public Binding bindingFanoutExchangeB(@Qualifier("BMessage") Queue BMessage, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(BMessage).to(fanoutExchange);
    }

    @Bean
    public Binding bindingFanoutExchangeC(@Qualifier("CMessage") Queue CMessage, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(CMessage).to(fanoutExchange);
    }


}
