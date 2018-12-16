package com.cun.provider.delayqueue.exam;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * Created by LiuYuanZhe on 2018/12/12.
 */
@Setter
@Getter
public class Student implements Runnable,Delayed{
    private String name;
    private long workTime;
    private long submitTime;
    private boolean isForce = false;
    private CountDownLatch countDownLatch;

    public Student() {
    }

    public Student(String name, long workTime, long submitTime, CountDownLatch countDownLatch) {
        this.name = name;
        this.workTime = workTime;
        this.submitTime = submitTime;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return 0;
    }

    @Override
    public int compareTo(Delayed o) {
        if (null == o || !(o instanceof Student)) return 1;
        if (o == this) return 1;
        Student s = (Student) o;
        return this.workTime > s.workTime ? 1 : (this.workTime == s.workTime ? 0 : -1);
    }

    @Override
    public void run() {
        if (isForce) System.out.println(name + " 交卷, 希望用时" + workTime + "分钟"+" ,实际用时 120分钟" );
        else         System.out.println(name + " 交卷, 希望用时" + workTime + "分钟"+" ,实际用时 "+ workTime +"分钟" );
        this.countDownLatch.countDown();
    }
}
