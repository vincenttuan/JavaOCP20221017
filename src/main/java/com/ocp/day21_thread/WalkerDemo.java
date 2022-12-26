package com.ocp.day21_thread;

public class WalkerDemo {
    public static void main(String[] args) {
        Walker w1 = new Walker();
        Walker w2 = new Walker();
        w1.setName("T1");
        w2.setName("T2");
        w2.setDaemon(true); // w2 設為背景執行緒
        w1.start();
        w2.start();
        System.out.printf("執行緒數量: %d\n", Thread.activeCount());
    }
}
