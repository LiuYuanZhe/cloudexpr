package com.cun.provider.pattern.adapter;

/**推荐使用对象适配器模式，相比类适配器模式，它更加灵活，也符合设计原则中的合成复用原则
 * 尽量使用合成/聚合的方式，而不是使用继承。
 *
 适配器模式的优点:
 提升了类的复用和灵活度。
 适配器模式的缺点:
 使用过多，系统会比较杂乱，难以把握。
 注意事项:
 适配器不是在详细设计时添加的，而是解决正在服役的项目的问题。
 * Created by LiuYuanZhe on 2018/11/26.
 */
public class FormatFactory1 implements Rmvb {
    private Mp4 mp4;
    public FormatFactory1(Mp4 mp4){
        this.mp4 = mp4;
    }
    @Override
    public void playRmvb() {
        mp4.playmp4();
    }

    public static void main(String[] args) {
        FormatFactory1 formatFactory1 = new FormatFactory1(new VideoPlayer());
        formatFactory1.playRmvb();
    }
}
