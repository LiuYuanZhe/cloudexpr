package com.cun.provider.messagequeue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;

/**
 * Created by LiuYuanZhe on 2018/12/9.
 */
@Configuration
@EnableJms
public class ActiveMQConfig {
    @Bean
    public Queue queue(){
        return new ActiveMQQueue("com.cun.provider");
    }
}
