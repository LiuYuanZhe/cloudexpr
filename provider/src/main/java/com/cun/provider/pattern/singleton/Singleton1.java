package com.cun.provider.pattern.singleton;

/**单例模式：
 * 构造方法私有化（private）;
 * 定义一个私有(private)静态(static)实例化对象;
 * 对外提供一个公共(public)静态(static)的方法得到该实例;
 * 饿汉式
 优点：写起来很简单，并且不会因为不加synchronized关键字而造成的线程不安全问题。
 缺点：当该类被加载的时候，会初始化该实例和静态变量并被创建并分配内存空间，并且会一直占用内存。
 * Created by LiuYuanZhe on 2018/11/25.
 */
public class Singleton1 {
    private static final Singleton1 singleton = new Singleton1();
    private Singleton1(){

    }
    public Singleton1 getInstance(){
        return singleton;
    }
}
