package com.example.testyc.util;

import com.google.common.collect.Maps;
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

import java.util.Map;

/**
 * @author zcw
 * @date 2019-12-26
 * @description rabbitMQ配置
 */
@Configuration
public class RabbitMQConfig {

    private static final Logger logger = LoggerFactory.getLogger(RabbitMQConfig.class);

    @Autowired
    private CachingConnectionFactory connectionFactory;

    @Bean
    public RabbitTemplate rabbitTemplate() {
        connectionFactory.setPublisherConfirms(true);
        connectionFactory.setPublisherReturns(true);
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMandatory(true);
        /**
         * 消息发送到 Broker 后触发回调，确认消息是否到达 Broker 服务器，也就是只确认是否正确到达 Exchange 中
         */
        rabbitTemplate.setConfirmCallback(new RabbitTemplate.ConfirmCallback() {
            @Override
            public void confirm(CorrelationData correlationData, boolean ack, String cause) {
                logger.info("消息发送成功：correlationData(消息唯一标识:{}),ack(确认结果:{}),cause(失败原因:{})", correlationData, ack, cause);
            }
        });
        /**
         * 启动消息失败返回，比如路由不到队列时触发回调
         */
        rabbitTemplate.setReturnCallback(new RabbitTemplate.ReturnCallback() {
            @Override
            public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String rotingKey) {
                logger.info("消息丢失：exchange({}),route({}),replyCode({}),replyText({}),message:{}", exchange, rotingKey, replyCode, replyText, message);
            }
        });
        return rabbitTemplate;
    }

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


    /**
     * dead letter 死信队列
     */

    /**
     * 死信队列 交换机标识符
     */
    private static final String DEAD_LETTER_QUEUE_KEY = "x-dead-letter-exchange";

    /**
     * 死信队列 交换机绑定键标识符
     */
    private static final String DEAD_LETTER_ROUTING_KEY = "x-dead-letter-routing-key";

    /**
     * 死信队列跟交换机类型没有关系 不一定为directExchange 不影响该类型交换机的特性.
     */
    @Bean
    public DirectExchange deadLetterExchange() {
        return new DirectExchange("DL_EXCHANGE", true, false);
    }

    /**
     * 声明一个死信队列.
     * x-dead-letter-exchange 对应 死信交换机
     * x-dead-letter-routing-key 对应 死信队列
     */
    @Bean
    public Queue deadLetterQueue() {
        Map args = Maps.newHashMap();
        // x-dead-letter-exchange 声明 死信交换机
        args.put(DEAD_LETTER_QUEUE_KEY, "DL_EXCHANGE");
        // x-dead-letter-routing-key 声明 死信路由键
        args.put(DEAD_LETTER_ROUTING_KEY, "KEY_R");
        return QueueBuilder.durable("DL_QUEUE").withArguments(args).build();
    }

    /**
     * 定义死信队列转发队列
     *
     * @return
     */
    @Bean
    public Queue redirectQueue() {
        return QueueBuilder.durable("REDIRECT_QUEUE").build();
    }

    /**
     * 死信路由通过 DL_KEY 绑定键绑定到死信队列上.
     *
     * @return
     */
    @Bean
    public Binding deadLetterBinding() {
        return new Binding("DL_QUEUE", Binding.DestinationType.QUEUE, "DL_EXCHANGE", "DL_KEY", null);
    }

    /**
     * 死信路由通过 KEY_R 绑定键绑定到死信队列上.
     *
     * @return
     */
    @Bean
    public Binding redirectBinding() {
        return new Binding("REDIRECT_QUEUE", Binding.DestinationType.QUEUE, "DL_EXCHANGE", "KEY_R", null);
    }




}
