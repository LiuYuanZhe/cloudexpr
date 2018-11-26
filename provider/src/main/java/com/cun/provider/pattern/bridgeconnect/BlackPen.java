package com.cun.provider.pattern.bridgeconnect;

/**
 * Created by LiuYuanZhe on 2018/11/26.
 */
public class BlackPen implements Pen {
    @Override
    public void write() {
        System.out.println("黑笔");
    }
}
