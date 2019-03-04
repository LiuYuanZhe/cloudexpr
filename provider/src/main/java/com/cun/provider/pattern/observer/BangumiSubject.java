package com.cun.provider.pattern.observer;

/**
 * Created by LiuYuanZhe on 2019/2/25.
 */
public interface BangumiSubject {
    void toThem(UserObserver us);
    void callOff(UserObserver us);
    void notifyUser();
}
