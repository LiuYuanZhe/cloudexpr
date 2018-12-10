package com.cun.provider.messagequeue;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * Created by LiuYuanZhe on 2018/12/9.
 */
@Service
public class MessageConsumerService {
    @JmsListener(destination="com.cun.provider")
    public void receiveMessage(String text) {    // 进行消息接收处理
        System.err.println("【*** 接收消息 ***】" + text);
    }
}
