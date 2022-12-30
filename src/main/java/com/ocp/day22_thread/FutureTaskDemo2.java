package com.ocp.day22_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class FutureTaskDemo2 {

    public static void main(String[] args) throws Exception {
        Runnable runnable = () -> System.out.println("我是 Runnable 無回傳值");
        Callable<String> callable = () -> {
            System.out.println("我是 Callable 有回傳值");
            return "Finish";
        };
        FutureTask task1 = new FutureTask(callable);
        FutureTask task2 = new FutureTask(runnable, "Finish");
        // 透過 ExecutorService 來執行 task
        ExecutorService service = Executors.newSingleThreadExecutor();
        //service.execute(task1);
        //System.out.println(task1.get());
        //service.execute(task2);
        //System.out.println(task2.get());
        //System.out.println(service.submit(callable).get());
        System.out.println(service.submit(runnable).get());
        service.shutdown();
    }
}
