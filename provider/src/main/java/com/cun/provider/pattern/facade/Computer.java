package com.cun.provider.pattern.facade;

/**
 *
 * 外观模式隐藏系统的复杂性，
 * 并向客户端提供了一个客户端可以访问系统的接口。
 * 这种类型的设计模式属于结构型模式，它向现有的系统添加一个接口，来隐藏系统的复杂性。
 外观模式的优点:
 降低了耦合，从某种方面来说也提升了安全性。
 外观模式的缺点:
 不符合开闭原则，不易更改。
 使用场景
 系统中有多个复杂的模块或者子系统的时候。
 * Created by LiuYuanZhe on 2018/11/26.
 */
public class Computer {
    private Game lol;
    private Game cf;
    public Computer(){
        lol = new Lol();
        cf = new Cf();
    }
    public void playlol(){
        lol.play();
    }
    public void playcf(){
        cf.play();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.playcf();
        computer.playlol();
    }
}
