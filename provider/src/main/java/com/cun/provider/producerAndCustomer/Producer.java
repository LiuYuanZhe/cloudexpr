package com.cun.provider.producerAndCustomer;

/**
 * Created by LiuYuanZhe on 18/3/31.
 *  实现生产者消费者接口来实现生产与消费行为
 */
public interface Producer {
    void produce() throws InterruptedException;
}
