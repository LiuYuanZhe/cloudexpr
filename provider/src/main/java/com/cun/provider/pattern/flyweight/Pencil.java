package com.cun.provider.pattern.flyweight;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 享元模式的角色主要分为三大类，抽象享元类、具体享元类以及享元工厂类。

 抽象享元类：所有具体享元类的超类或者接口，通过这个接口，可以接受并作用于外部专题。
 具体享元类：实现抽象享元类接口的功能并增加存储空间。
 享元工厂类：用来创建并管理抽象享元类对象，它主要用来确保合理地共享。每当接受到一个请求是，便会提供一个已经创建的抽象享元类对象或者新建一个。
 享元模式的核心在于享元工厂类，享元工厂类的作用在于提供一个用于存储享元对象的享元池，
 用户需要对象时，首先从享元池中获取，如果享元池中不存在 ，则创建一个新的享元对象返回给用户，并在享元池中保存该新增对象。

 * Created by LiuYuanZhe on 2018/12/3.
 */
@Getter
@Setter
@ToString
public class Pencil implements Pen{
    private String name;
    private String something;
    private int i;
    public Pencil(String name){
        this.name = name;
        System.out.println("第"+i+"次创建");
        i++;
    }

    @Override
    public void wirte() {
        System.out.println(name+"用铅笔写关于"+something+"的事情");
    }
}
