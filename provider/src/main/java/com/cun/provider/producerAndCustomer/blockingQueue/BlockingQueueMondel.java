package com.cun.provider.producerAndCustomer.blockingQueue;

import com.cun.provider.producerAndCustomer.*;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by LiuYuanZhe on 18/3/31.
 * 使用阻塞队列来实现生产者消费者模型
 * queue队列的操作
 * offer，向队列末尾插入，返回值：成功？true:false 不会抛出异常
 * put：插入元素，等待队列空间，队列满会一直阻塞等待，等待插入
 * add：插入元素，如果没有空间，会抛出异常
 * take：取元素，不成功会一直阻塞等待可取为止
 */
public class BlockingQueueMondel implements Model {
//    创建阻塞队列
    private final BlockingQueue<Task> queue;
//    使用原子操作类来进行数量的加减，保证并发编程时的可见和安全（cas实现）
    private final AtomicInteger increTaskNo = new AtomicInteger(0);
//    queue作为生产者与消费者的缓冲区。cap：容量。
    public BlockingQueueMondel(int cap) {
        this.queue = new LinkedBlockingDeque(cap);
    }

//    定义生产者和消费者的实现
    @Override
    public Runnable newRunnableConsumer() {
        return new ConsumerImpl();
    }
    @Override
    public Runnable newRunnableProducer() {
        return new ProducerImpl();
    }

//    生产者消费者的实现类，主要实现生产与消费的行为
    private class ConsumerImpl extends AbstractConsumer implements Consumer,Runnable {
        @Override
        public void consume() throws InterruptedException {
//            从缓冲区中取货物，不需要判断空，使用阻塞队列实现，每次生产随机休眠半秒内
            Task task = queue.take();
            Thread.sleep(500 + (long)(Math.random()*500));
            System.out.println("consume: " + task.no);
        }
    }

    private class ProducerImpl extends AbstractProducer implements Producer,Runnable {
        @Override
        public void produce() throws InterruptedException {
//            将货物放入缓冲区。每次操作随机休眠一秒内
            Thread.sleep((long) (Math.random()*1000));
            Task task = new Task(increTaskNo.getAndIncrement());
            queue.put(task);
            System.out.println("produce :" + task.no);
        }
    }

    public static void main(String[] args) {
        Model model = new BlockingQueueMondel(3);
        for (int i = 0;i < 2;i++){
            new Thread(model.newRunnableConsumer()).start();
        }
        for (int i = 0;i < 5;i++){
            new Thread(model.newRunnableProducer()).start();
        }
    }

}
