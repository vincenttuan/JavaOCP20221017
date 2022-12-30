package com.ocp.day22_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class FutureTaskDemo {
    public static void main(String[] args) throws Exception {
        Runnable runnable = () -> System.out.println("我是 Runnable 無回傳值");
        Callable<String> callable = () -> {
            System.out.println("我是 Callable 有回傳值");
            return "Finish";
        };
        
        FutureTask task1 = new FutureTask(callable);
        new Thread(task1).start();
        System.out.println(task1.get());
        
        FutureTask task2 = new FutureTask(runnable, "Finish");
        new Thread(task2).start();
        System.out.println(task2.get());
        
    }
}
