package com.cun.provider.pattern.builder;

/**
 * Created by LiuYuanZhe on 2018/11/25.
 */
public interface IBuilderFood {
    void setDrink();
    void setFood();
    Meal createMeal();
}
