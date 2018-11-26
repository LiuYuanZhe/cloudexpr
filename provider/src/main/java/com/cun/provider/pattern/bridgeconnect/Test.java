package com.cun.provider.pattern.bridgeconnect;

/**
 * Created by LiuYuanZhe on 2018/11/26.
 */
public class Test {
    public static void main(String[] args) {
        Paper examinationPaper = new ExaminationPaper();
        examinationPaper.setPen(new RedPen());
        Paper newsPaper = new Newspaper();
        newsPaper.setPen(new BlackPen());
        examinationPaper.writing();
        newsPaper.writing();
    }
}
