package com.cun.provider.pattern.Factory.factoryMethod;

import com.cun.provider.pattern.Factory.Game;
import com.cun.provider.pattern.Factory.LOL;

/**
 * Created by LiuYuanZhe on 2018/11/25.
 */
public class LOLFactory implements GameFactory {
    @Override
    public Game getGame(String gamename) {
        return new LOL();
    }
}
