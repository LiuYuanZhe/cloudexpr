package com.cun.provider.pattern.decorator;

/**
 * Created by LiuYuanZhe on 2018/11/26.
 */
public class LighterSaber extends AddExra {
    public LighterSaber(Model model) {
        super(model);
    }
    void addLighterSaber(){
        System.out.println("添加光剑");
    }

    @Override
    public void assemable() {
        model.assemable();
        addLighterSaber();
    }
}
