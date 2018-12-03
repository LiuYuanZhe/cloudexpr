package com.cun.provider.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LiuYuanZhe on 2018/12/3.
 */
public class PenFactory {
    private static final Map<String,Pencil> map = new HashMap<>();
    public static Pencil getPencil(String name){
        Pencil pencil = map.get(name);
        if (null == pencil){
            pencil = new Pencil(name);
            map.put(name,pencil);
        }
        return pencil;
    }
}
