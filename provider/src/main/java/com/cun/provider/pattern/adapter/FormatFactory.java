package com.cun.provider.pattern.adapter;

/**
 * 如果还有新增的视频格式，也需要使用该视频播放器播放的话，只需在增加一个接口以及格式工厂类就可以了。
 * 是类适配器模式，它需要完成一下步骤：
 建立MP4、AVI、RVMB视频格式的接口；
 建立一个视频播放器的类实现MP4视频格式的类；
 编写一个格式工厂类，将AVI、RVMB等格式的视频文件转换成MP4格式的文件。
 播放这些视频。
 * Created by LiuYuanZhe on 2018/11/26.
 */
public class FormatFactory extends VideoPlayer implements Avi {

    @Override
    public void playAvi() {
        playmp4();
    }

    public static void main(String[] args) {
        Mp4 mp4 = new VideoPlayer();
        mp4.playmp4();
        Avi avi = new FormatFactory();
        avi.playAvi();
    }
}
