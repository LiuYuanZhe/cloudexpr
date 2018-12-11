package com.cun.provider.delayqueue;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by LiuYuanZhe on 2018/12/11.
 */
public class DelayQueueTest {
    public static void main(String[] args) throws Exception{
        DelayQueue<Message> delayQueue = new DelayQueue<>();
        Message msg1 = new Message(1,"hello",5000);
        Message msg2 = new Message(2,"world",10000);
        delayQueue.offer(msg1);
        delayQueue.offer(msg2);
//        Thread.sleep(30000);
//        这里线程池最好自己实现
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.execute(new Consumer(delayQueue));
        executorService.shutdown();
    }
}
