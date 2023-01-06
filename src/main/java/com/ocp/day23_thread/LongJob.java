package com.ocp.day23_thread;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class LongJob implements Runnable {

    @Override
    public void run() {
        String tName = Thread.currentThread().getName();
        System.out.println(tName + "長任務開始");
        try {
            TimeUnit.SECONDS.sleep(new Random().nextInt(5) + 1);
        } catch (Exception e) {
        }
        System.out.println(tName + "長任務結束");
        
    }
    
}
