package com.cun.provider.delayqueue;

import java.util.concurrent.DelayQueue;

/**
 * 创建消费者
 * Created by LiuYuanZhe on 2018/12/11.
 */
public class Consumer implements Runnable{

    private DelayQueue<Message> queue;

    public Consumer(DelayQueue<Message> queue){
        this.queue = queue;
    }
    @Override
    public void run() {
        while (true){
            try {
                Message msg = queue.take();
                System.out.println("正在消费message,id:"+msg.getId() + ",body:" +msg.getBody());
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }

    }
}
