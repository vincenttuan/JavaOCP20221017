package com.ocp.day23_thread;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executor;

public class MyExecutorDemo {
    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println(new Date());
        Runnable r2 = () -> System.out.println(new Random().nextInt(100));
        
        Executor exec = new MyExecutor();
        exec.execute(r1);
        exec.execute(r2);
    }
}
