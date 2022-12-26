package com.ocp.day21_runnable;

import java.util.Date;

/*
@FunctionalInterface
public interface Runnable {
    void run();
}
*/
public class RunnableExec2 {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(new Date());
            }
        };
        Runnable r2 = () -> System.out.println(Math.random());
        
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        
        t1.start();
        t2.start();
        
    }
}
