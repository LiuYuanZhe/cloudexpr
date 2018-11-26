package com.cun.provider.pattern.decorator;

/**
 * 装饰器模式允许向一个现有的对象添加新的功能，同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。
 * 装饰器模式可以动态地给一个对象添加一些额外的职责。
 *
 装饰器模式的优点:
 装饰类和被装饰类可以独立发展，耦合度低，易于扩展，灵活方便。
 装饰器模式的缺点:
 过多的对某个类进行装饰，会增加复杂度。
 使用场景 原型不变，动态增加一些功能的时候。
 * Created by LiuYuanZhe on 2018/11/26.
 */
public interface Model {
    void assemable();
}
