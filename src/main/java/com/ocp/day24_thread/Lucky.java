package com.ocp.day24_thread;

import java.util.Random;
import java.util.concurrent.Callable;

public class Lucky implements Callable<Integer> {

    @Override
    public Integer call() throws InterruptedException {
        //Thread.sleep(new Random().nextInt(10));
        Thread.sleep(500);
        int n = new Random().nextInt(100);
        System.out.println(n + " : " + Thread.currentThread().getName());
        return n;
    }
    
}
