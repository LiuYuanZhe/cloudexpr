package com.cun.provider.pattern.builder;

/**
 * Created by LiuYuanZhe on 2018/11/25.
 */
public class Breakfast implements IBuilderFood {
    private Meal meal;
    public Breakfast(){
        meal = new Meal();
    }
    @Override
    public void setDrink() {
        meal.setDrink("豆浆");
    }

    @Override
    public void setFood() {
        meal.setFood("油条");
    }

    @Override
    public Meal createMeal() {
        return meal;
    }
}
