package com.cun.provider.pattern.builder;

/**
 * Builder：指定一个抽象的接口，规定该产品所需实现部件的创建，并不涉及具体的对象部件的创建。
 ConcreteBuilder：需实现Builder接口，并且针对不同的逻辑，进行不同方法的创建，最终提供该产品的实例。
 Director：用来创建复杂对象的部分，对该部分进行完整的创建或者按照一定的规则进行创建。
 Product：示被构造的复杂对象。
 使用场景: 适用一些基本组件不便，但是组合经常变化的时候。比如超市促销的大礼包。
 优点:
 建造者独立，易扩展。
 便于控制细节风险。
 缺点
 内部结构复杂，不易于理解。
 产品直接需要有共同点，范围有控制。
 * Created by LiuYuanZhe on 2018/11/25.
 */
public class FoodStore{
    public Meal createFood(IBuilderFood iBuilderFood){
        iBuilderFood.setDrink();
        iBuilderFood.setFood();
        return iBuilderFood.createMeal();
    }

    public static void main(String[] args) {
        Meal bf = new FoodStore().createFood(new Breakfast());
        Meal lunch = new FoodStore().createFood(new Lunch());
        System.out.println(bf.toString());
        System.out.println(lunch.toString());
    }
}
