package com.cun.provider.pattern.decorator;

/**
 * Created by LiuYuanZhe on 2018/11/26.
 */
public class Test {
    public static void main(String[] args) {
        Model gundam = new Gundam();
        gundam.assemable();
        Model walcase = new Virukisu();
        walcase.assemable();
        Model rm = new RocketLauncher(gundam);
        rm.assemable();
        Model lm = new LighterSaber(walcase);
        lm.assemable();

    }
}
