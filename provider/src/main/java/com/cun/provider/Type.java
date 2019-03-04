package com.cun.provider;

import com.cun.provider.pattern.Factory.CF;
import com.cun.provider.pattern.Factory.Game;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by LiuYuanZhe on 2019/2/24.
 */
public class Type{
    private static volatile Type type;

    private Type(){}

    public static Type getTypeSingleton(){
        if (null != type){
            synchronized (Type.class){
                Lock lock =  new ReentrantLock();
                try {

                }catch (Exception ex){
                    ex.printStackTrace();
                }
                if (null != type){
                    type = new Type();
                }
            }
        }
        return type;
    }

    public static void main(String[] args) {
        Game game = new CF();
//        SoftReference<Game> gameSoftReference = new SoftReference<Game>(game);
//        gameSoftReference.enqueue();
//        WeakReference<Game> gameWeakReference = new WeakReference<Game>(game);
//        gameWeakReference.isEnqueued();
//        System.out.println(game);
//        String str = "abc";
//        final ReferenceQueue<String> referenceQueue = new ReferenceQueue<String>();
//        PhantomReference<String> phantomReference = new PhantomReference<String>(str,referenceQueue);
        List<? super CF> games = new ArrayList<CF>();
        games.add(new CF());
        games.get(0);
        games.remove(0);
    }
}
