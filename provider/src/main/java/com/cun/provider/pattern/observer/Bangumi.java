package com.cun.provider.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiuYuanZhe on 2019/2/25.
 */
public class Bangumi implements BangumiSubject {
    private List<UserObserver> userObservers;
    private String anime;
    public Bangumi(String name){
        this.anime = name;
        this.userObservers = new ArrayList<>();
    }
    @Override
    public void toThem(UserObserver us) {
        System.out.println("用户"+us.getName()+"订阅了"+this.anime);
        this.userObservers.add(us);
    }

    @Override
    public void callOff(UserObserver us) {
        System.out.println("用户"+us.getName()+"取消订阅了"+this.anime);
        this.userObservers.remove(us);
    }

    @Override
    public void notifyUser() {
        System.out.println("番剧"+this.anime+"更新了");
        this.userObservers.forEach(us->
                us.update(this.anime));
    }
}
