package com.ocp.day24_thread;

// 單次性排程

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class SingleThreadScheduledDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException{
        ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
        System.out.println("Lotto 停一秒後開始運作: " + new Date());
        ScheduledFuture future = exec.schedule(new Lotto(), 1, TimeUnit.SECONDS);
        System.out.println(future.get());
        System.out.println("Lotto 結束運作: " + new Date());
        
        System.out.println("Lucky 停一秒後開始運作: " + new Date());
        ScheduledFuture future2 = exec.schedule(new Lucky(), 1, TimeUnit.SECONDS);
        System.out.println(future2.get());
        System.out.println("Lucky 結束運作: " + new Date());
        
        exec.shutdown();
    }
            
}
