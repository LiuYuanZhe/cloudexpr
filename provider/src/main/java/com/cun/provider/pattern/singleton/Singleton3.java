package com.cun.provider.pattern.singleton;

/**
 * 静态内部类
 * 该类的内部类是私有的，除了对外公布的公共静态方法getInstance()，是无法访问的
 * 延迟加载，所以读取读取实例的时候不会进行同步，几乎没有性能的缺陷，而且还是线程安全的，并且不依赖JDK的版本。
 *
 * Created by LiuYuanZhe on 2018/11/25.
 */
public class Singleton3 {
    private Singleton3(){};
    public static final Singleton3 getInstance(){
        return Singleton4.instance;
    }
    private static class Singleton4{
        private static Singleton3 instance = new Singleton3();
    }
}
