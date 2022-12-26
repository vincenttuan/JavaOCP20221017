package com.ocp.day21_thread;

public class WalkerDemo2 {
    public static void main(String[] args) {
        System.out.println("龜兔賽跑:");
        Walker w1 = new Walker();
        Walker w2 = new Walker();
        w1.setName("烏龜");
        w2.setName("兔子");
        w1.setPriority(Thread.MAX_PRIORITY); // 10
        w2.setPriority(Thread.MIN_PRIORITY); // 1
        w1.start();
        w2.start();
        
    }
}
