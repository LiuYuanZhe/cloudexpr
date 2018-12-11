package com.cun.provider.delayqueue;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * 消息体
 * Created by LiuYuanZhe on 2018/12/10.
 */
@Getter
@Setter
public class Message implements Delayed {
    private int id;
    private String body;
    private long execTime;
    public Message(int id,String body,long delayTime){
        this.id = id;
        this.body = body;
        this.execTime = TimeUnit.NANOSECONDS.convert(delayTime,TimeUnit.MILLISECONDS) + System.nanoTime();
    }

    // 延迟任务是否到时就是按照这个方法判断如果返回的是负数则说明到期否则还没到期
    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(this.execTime - System.nanoTime(),TimeUnit.NANOSECONDS);
    }

//    自定义比较方法返回1，0，-1 标准
    @Override
    public int compareTo(Delayed o) {
        Message message = (Message) o;
        return Integer.valueOf(this.id) > Integer.valueOf(message.id) ?
                1 : (Integer.valueOf(message.id)<Integer.valueOf(this.id) ? -1 : 0);
    }
}
