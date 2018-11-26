package com.cun.register.controller;

/**
 * Created by LiuYuanZhe on 18/11/7.
 */
public class ArraySort implements Runnable{
    private String num;
    public ArraySort(int num){
        this.num = num+"";
    }

    public static void main(String[] args) {
        int a[] = {15536,55,1,5331,128};
        for (int i = 0;i < a.length;i++){
            new Thread(new ArraySort(a[i])).start();
        }
    }
    @Override
    public void run() {
        try {
            Thread.sleep(Integer.parseInt(this.num));
            System.out.println(this.num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
