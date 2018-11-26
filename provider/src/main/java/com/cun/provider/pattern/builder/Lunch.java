package com.cun.provider.pattern.builder;

/**
 * Created by LiuYuanZhe on 2018/11/25.
 */
public class Lunch implements IBuilderFood {
    private Meal meal;
    public Lunch(){
        meal = new Meal();
    }
    @Override
    public void setDrink() {
        meal.setDrink("可乐");
    }

    @Override
    public void setFood() {
        meal.setFood("汉堡");
    }

    @Override
    public Meal createMeal() {
        return meal;
    }
}
