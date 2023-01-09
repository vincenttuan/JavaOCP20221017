package com.ocp.day24_thread;

// scheduleWithFixedDelay

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// scheduleAtFixedRate
public class ScheduledFixedDemo {
    public static void main(String[] args) {
        ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
        //exec.scheduleWithFixedDelay(new Lotto(), 1, 1, TimeUnit.SECONDS);
        exec.scheduleAtFixedRate(new Lotto(), 1, 1, TimeUnit.SECONDS);
        System.out.println("執行中...");
    }
}
