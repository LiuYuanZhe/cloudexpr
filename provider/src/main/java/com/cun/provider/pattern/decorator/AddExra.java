package com.cun.provider.pattern.decorator;

/**
 * Created by LiuYuanZhe on 2018/11/26.
 */
public abstract class AddExra implements Model{
    protected Model model;
    public AddExra(Model model){
        this.model = model;
    }
    public void assemable(){
        model.assemable();
    }
}
