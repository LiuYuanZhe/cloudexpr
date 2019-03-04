package com.cun.provider.pattern.Factory.factoryMethod;

import com.cun.provider.pattern.Factory.CF;
import com.cun.provider.pattern.Factory.Game;

/**
 * Created by LiuYuanZhe on 2018/11/25.
 */
public class CFFactory implements GameFactory {
    @Override
    public Game getGame(String gamename) {
        return new CF();
    }
}
