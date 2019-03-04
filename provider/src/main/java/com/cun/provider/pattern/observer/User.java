package com.cun.provider.pattern.observer;

/**
 * 观察者模式又叫发布-订阅(Publish/Subscribe)模式、模型-视图(Model/View)模式、源-监听器(Source/Listener)模式或从属者(Dependents)模式。
 * 观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。
 * 这个主题对象在状态上发生变化时，会通知所有观察者对象，使它们能够自动更新自己。。
 其主要目的是定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。

 观察者模式主要由这四个角色组成，抽象主题角色（Subject）、具体主题角色（ConcreteSubject）、抽象观察者角色（Observer）和
 具体观察者角色（ConcreteObserver）。

 抽象主题角色（Subject）：它把所有观察者对象的引用保存到一个聚集里，每个主题都可以有任何数量的观察者。
 抽象主题提供一个接口，可以增加和删除观察者对象。
 具体主题角色（ConcreteSubject）：将有关状态存入具体观察者对象；在具体主题内部状态改变时，给所有登记过的观察者发出通知。
 抽象观察者角色（Observer）：主要是负责从备忘录对象中恢复对象的状态。

 * Created by LiuYuanZhe on 2019/2/25.
 */
public class User implements UserObserver {
    private String name;
    public User(String name){
        this.name = name;
    }

    @Override
    public void update(String Bangumi) {
        System.out.println(name+"订阅的番剧"+Bangumi+"更新了");
    }

    @Override
    public String getName() {
        return this.name;
    }
    public static void main(String[] args) {
        String name1 ="张三";
        String name2 ="xuwujing";
        String	bingguo = "冰菓";
        String	fate = "fate/zero";
        BangumiSubject bs1 = new Bangumi(bingguo);
        BangumiSubject bs2 = new Bangumi(fate);

        UserObserver uo1 = new User(name1);
        UserObserver uo2 = new User(name2);
//
//        //进行订阅
//        bs1.toThem(uo1);
//        bs1.toThem(uo2);
//        bs2.toThem(uo1);
//        bs2.toThem(uo2);
//        //进行通知
//        bs1.notifyUser();
//        bs2.notifyUser();
//
//        //取消订阅
//        bs1.callOff(uo1);
//        bs2.callOff(uo2);
//        //进行通知
//        bs1.notifyUser();
//        bs2.notifyUser();
        System.out.println(System.getProperty("user.dir"));
    }

}
