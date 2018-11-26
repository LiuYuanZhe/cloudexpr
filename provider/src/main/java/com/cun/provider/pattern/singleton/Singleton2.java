package com.cun.provider.pattern.singleton;

/**
 * 饱汉式
 优点：写起来很简单，在第一次调用的时候才会初始化，节省了内存。
 缺点：线程不安全，多个线程调用可能会出现多个实例。
 总结：书写简单，线程不安全，效率还行。
 * Created by LiuYuanZhe on 2018/11/25.
 */
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2(){};
    private static Singleton2 getInstance(){
        if (null == instance){
            instance = new Singleton2();
        }
        return instance;
    }
}
