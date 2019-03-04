package com.cun.provider.producerAndCustomer.lockAndCondition;

import com.cun.provider.producerAndCustomer.*;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by LiuYuanZhe on 18/4/1.
 * 使用reetrantlock 重入锁实现生产者消费者模型 显示锁，需要自己上锁，finally时释放资源
 * condition：Condition的作用是对锁进行更精确的控制。Condition中的await()方法相当于Object的wait()方法，
 * Condition中的signal()方法相当于Object的notify()方法，Condition中的signalAll()相当于Object的notifyAll()方法。
 * 不同的是，Object中的wait(),notify(),notifyAll()方法是和"同步锁"(synchronized关键字)捆绑使用的；
 * 而Condition是需要与"互斥锁"/"共享锁"捆绑使用的。
 * <p>
 * ReentrantLock.lockInterruptibly允许在等待时由其它线程调用等待线程的Thread.interrupt方法来中断等待线程的等待而直接返回，
 * 这时不用获取锁，而会抛出一个InterruptedException。 ReentrantLock.lock方法不允许Thread.interrupt中断,
 * 即使检测到Thread.isInterrupted,一样会继续尝试获取锁，失败则继续休眠。只是在最后获取锁成功后再把当前线程置为interrupted状态,
 * 然后再中断线程。
 */
public class LockConditionModel implements Model {
    //    定义锁
    private final Lock BUFFER_LOCK = new ReentrantLock();
    //    在上方有定义，帮助锁更精准控制线程
    private final Condition BUFFER_COND = BUFFER_LOCK.newCondition();
    //    定义队列 用queue定义的队列也是linklist，但是和list接口定义的linkedlist操作有区别
    private final Queue<Task> buffer = new LinkedList<Task>();
    //    在阻塞队列中有相关注释
    private final int cap;
    private final AtomicInteger increTaskNo = new AtomicInteger(0);

    public LockConditionModel(int cap) {
        this.cap = cap;
    }

    //    定义生产者消费者并实现
    @Override
    public Runnable newRunnableConsumer() {
        return new ConsumerImpl();
    }

    @Override
    public Runnable newRunnableProducer() {
        return new ProducerImpl();
    }

    private class ConsumerImpl extends AbstractConsumer implements Consumer, Runnable {
        @Override
        public void consume() throws InterruptedException {
//            获取当前锁
            BUFFER_LOCK.lockInterruptibly();
            try {
//                判断缓冲区是否为空，为空的话唤醒
                while (buffer.size() == 0) {
                    BUFFER_COND.await();
                }
//                从缓存区获取一个货物
                Task task = buffer.poll();
                assert task != null;
                Thread.sleep(500 + (long) (Math.random() * 500));
                System.out.println("consume: " + task.no);
//                唤醒其他进程生产
                BUFFER_COND.signalAll();
            } finally {
//                释放资源
                BUFFER_LOCK.unlock();
            }
        }
    }

    private class ProducerImpl extends AbstractProducer implements Producer, Runnable {
        @Override
        public void produce() throws InterruptedException {
            Thread.sleep((long) (Math.random() * 1000));
            BUFFER_LOCK.lockInterruptibly();
            try {
                while (buffer.size() == cap) {
                    System.out.println("产品已满,请消费者消费");
                    BUFFER_COND.await();
                }
                Task task = new Task(increTaskNo.getAndIncrement());
                buffer.offer(task);
                System.out.println("produce: " + task.no);
                BUFFER_COND.signalAll();
            } finally {
                BUFFER_LOCK.unlock();
            }
        }
    }

    public static void main(String[] args) {
        Model model = new LockConditionModel(3);
        for (int i = 0; i < 2; i++) {
            new Thread(model.newRunnableConsumer()).start();
        }
        for (int i = 0; i < 5; i++) {
            new Thread(model.newRunnableProducer()).start();
        }
    }
}
