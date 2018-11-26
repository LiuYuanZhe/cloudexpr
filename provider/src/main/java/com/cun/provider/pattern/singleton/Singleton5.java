package com.cun.provider.pattern.singleton;

/**
 * 枚举需要在JDK1.5之后的版本，它无偿提供序列化机制，绝对防止多次实例化，即使在面对复杂的序列化或者反射攻击的时候。
 * Created by LiuYuanZhe on 2018/11/25.
 */
public enum  Singleton5 {
    Instance;
}
