package com.cun.provider.producerAndCustomer;

/**
 * Created by LiuYuanZhe on 18/3/31.
 * 实现model接口来实现创建生产者与消费者线程
 */
public interface Model {
    Runnable newRunnableConsumer();
    Runnable newRunnableProducer();
}
