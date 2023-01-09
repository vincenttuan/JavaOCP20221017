package com.ocp.day24_thread;

import java.util.Date;
import java.util.Random;

public class Lotto implements Runnable {

    @Override
    public void run() {
        System.out.print(new Date() + " [ ");
        try {
            //Thread.sleep(new Random().nextInt(10));
            Thread.sleep(500);
        } catch (InterruptedException ex) {
        }
        int n = new Random().nextInt(100);
        System.out.print(n);
        System.out.println(" ] " + new Date());
    }
    
}
