package com.cun.provider.pattern.proxy;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by LiuYuanZhe on 2018/12/3.
 */
@Getter
@Setter
public class ExecutePerson implements Shopping{
    private String name;
    public ExecutePerson(String name){
       this.name = name;
    }

    @Override
    public void buySomething() {
        System.out.println(name + "再买东西");
    }
}
