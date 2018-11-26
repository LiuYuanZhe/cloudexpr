package com.cun.provider.pattern.singleton;

/**
 * 双重锁检查
 * 通过volatile定义静态私有变量，保证了该变量的可见性，然后定义一个共有的静态方法，
 * 第一次对该对象实例化时与否判断，不为空直接返回，提升效率；
 * 然后使用synchronized 进行同步代码块，防止对象未初始化时，
 * 在多线程访问该对象在第一次创建后，再次重复的被创建；
 * 然后第二次对该对象实例化时与否判断，如果未初始化，则初始化，否则直接返回该实例。

 * Created by LiuYuanZhe on 2018/11/25.
 */
public class Singleton4 {
    private static volatile Singleton4 instance;
    private Singleton4(){};
    public static Singleton4 getInstance(){
        if(null != instance){
            synchronized (Singleton4.class){
                if (null != instance){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
