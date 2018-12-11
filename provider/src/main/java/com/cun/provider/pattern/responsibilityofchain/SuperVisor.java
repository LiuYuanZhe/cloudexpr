package com.cun.provider.pattern.responsibilityofchain;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by LiuYuanZhe on 2018/12/4.
 */
@Setter
@Getter
public class SuperVisor extends Leader{
    private String name;
    private String someThing;

    public SuperVisor(String name, String someThing) {
        this.name = name;
        this.someThing = someThing;
    }

    @Override
    public void handler(int level) {
        if (level > 1){
            System.out.println("主管同意了"+name+"描述的"+someThing);
        }else {
            System.out.println("主管不能处理"+name+"描述的"+someThing+",转交给上级处理");
            getLeader().handler(level);
        }
    }
}
