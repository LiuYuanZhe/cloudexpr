package com.cun.provider.pattern.Factory.factoryMethod;

import com.cun.provider.pattern.Factory.Game;

/**
 * 工厂方法模式
 * 工厂类变成了多个了，降低了耦合度。如果新增一个游戏类，相应的也只需在新增一个工厂类而已， 并且完美的遵循了开放-封闭原则。
 * Created by LiuYuanZhe on 2018/11/25.
 */
public interface GameFactory {
    Game getGame(String gamename);

    public static void main(String[] args) {
        Game game = new CFFactory().getGame("cf");
        game.play();
    }
}
