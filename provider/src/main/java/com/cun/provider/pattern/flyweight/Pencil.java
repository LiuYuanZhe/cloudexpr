package com.cun.provider.pattern.flyweight;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
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
