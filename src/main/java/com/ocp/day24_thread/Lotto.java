package com.ocp.day24_thread;

import java.util.Date;
import java.util.Random;

public class Lotto implements Runnable {

    @Override
    public void run() {
        System.out.print(new Date() + " [ ");
        int jobTime = new Random().nextInt(1500);
        try {
            Thread.sleep(jobTime);
            //Thread.sleep(500);
        } catch (InterruptedException ex) {
        }
        int n = new Random().nextInt(100);
        System.out.print(n);
        System.out.print(" (" + jobTime + ") ");
        System.out.println(" ] " + new Date());
    }
    
}
