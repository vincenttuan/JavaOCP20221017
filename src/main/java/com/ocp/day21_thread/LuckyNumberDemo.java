package com.ocp.day21_thread;

public class LuckyNumberDemo {
    public static void main(String[] args) {
        LuckyNumber n1 = new LuckyNumber("小明", 777);
        LuckyNumber n2 = new LuckyNumber("小華", 777);
        n1.start();
        n2.start();
    }
}
