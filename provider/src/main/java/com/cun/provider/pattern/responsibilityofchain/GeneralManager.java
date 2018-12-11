package com.cun.provider.pattern.responsibilityofchain;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by LiuYuanZhe on 2018/12/11.
 */
@Getter
@Setter
public class GeneralManager extends Leader{
    private String name;
    private String someThing;

    public GeneralManager(String name, String someThing) {
        this.name = name;
        this.someThing = someThing;
    }

    @Override
    public void handler(int level) {
        boolean flag=true;
        if(level > -1){
            //这就就直接设置同意了
            if(flag){
                System.out.println("总经理同意了  "+name+"所述的<"+someThing+">事情!");
            }else{
                System.out.println("总经理不同意  "+name+"所述的<"+someThing+">事情!");
            }
        }else{
            System.out.println("总经理未能处理  "+name+"所述的<"+someThing+">事情!转交给上级!");
            getLeader().handler(level);
        }
    }
}
