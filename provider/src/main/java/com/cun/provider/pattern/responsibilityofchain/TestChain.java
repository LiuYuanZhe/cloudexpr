package com.cun.provider.pattern.responsibilityofchain;

/**
 * Created by LiuYuanZhe on 2018/12/11.
 */
public class TestChain {
    public static void main(String[] args) {
        String someThing = "请假";
        String name = "小李";
        Leader leader1 = new SuperVisor(name,someThing);
        Leader leader2 = new BranchManager(name,someThing);
        Leader leader3 = new GeneralManager(name,someThing);
        leader1.setLeader(leader2);
        leader2.setLeader(leader3);
        leader1.handler(0);
    }
}
