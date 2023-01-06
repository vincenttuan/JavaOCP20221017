package com.ocp.day23_thread;

import java.util.Random;

public class Lotto implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(new Random().nextInt(10));
        } catch (InterruptedException ex) {
        }
        int n = new Random().nextInt(100);
        System.out.println(n);
    }
    
}
