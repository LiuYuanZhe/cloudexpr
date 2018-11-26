package com.cun.provider.pattern.decorator;

/**
 * Created by LiuYuanZhe on 2018/11/26.
 */
public class RocketLauncher extends AddExra {
    public RocketLauncher(Model model) {
        super(model);
    }
    void addRocket(){
        System.out.println("添加火箭炮");
    }

    @Override
    public void assemable() {
        model.assemable();
        addRocket();
    }
}
