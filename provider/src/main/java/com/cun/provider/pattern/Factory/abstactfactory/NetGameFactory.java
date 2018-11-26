package com.cun.provider.pattern.Factory.abstactfactory;

import com.cun.provider.pattern.Factory.CF;
import com.cun.provider.pattern.Factory.Game;
import com.cun.provider.pattern.Factory.LOL;

/**
 * Created by LiuYuanZhe on 2018/11/25.
 */
public class NetGameFactory implements GameFactory {
    @Override
    public Game getLOL() {
        return new LOL();
    }

    @Override
    public Game getCF() {
        return new CF();
    }
}
