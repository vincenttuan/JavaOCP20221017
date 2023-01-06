package com.ocp.day23_thread;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Car implements Runnable {
    private CyclicBarrier cb;
    public Car(CyclicBarrier cb) {
        this.cb = cb;
    }

    @Override
    public void run() {
        String tName = Thread.currentThread().getName();
        System.out.printf("%s 從台北出發\n", tName);
        try {
            Thread.sleep(new Random().nextInt(5000));
            System.out.printf("%s 到台中了\n", tName);
            cb.await(); // 等待是否達到 parties 的設置
            System.out.printf("%s 繼續往高雄...\n", tName);
        } catch (Exception e) {
            System.out.printf("%s 發生意外!\n", tName);
        }
        System.out.printf("%s 程式結束!\n", tName);
    }
    
}
