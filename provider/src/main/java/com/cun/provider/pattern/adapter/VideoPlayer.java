package com.cun.provider.pattern.adapter;

/**
 * Created by LiuYuanZhe on 2018/11/26.
 */
public class VideoPlayer implements Mp4 {
    @Override
    public void playmp4() {
        System.out.println("正在播放mp4");
    }
}
