package com.cun.provider.pattern.bridgeconnect;

/**
 * 桥接模式的优点:
 1、抽象和实现的分离，实现了解耦； 2、提升的扩展能力。
 桥接模式的缺点:
 会使系统看起复杂，对新手不友好，没有一定的抽象进行设计能力难以理解。
 使用场景:
 一个类存在两个独立变化的维度，且这两个维度都需要进行扩展。
 * Created by LiuYuanZhe on 2018/11/26.
 */
public abstract class Paper {
    protected Pen pen;
    void setPen(Pen pen){
        this.pen = pen;
    }
    abstract void writing();
}
