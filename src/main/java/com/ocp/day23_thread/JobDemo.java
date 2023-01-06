package com.ocp.day23_thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class JobDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor exec = (ThreadPoolExecutor)Executors.newCachedThreadPool();
        exec.submit(new Job());
        exec.submit(new LongJob());
        exec.submit(new Job());
        exec.submit(new LongJob());
        exec.submit(new Job());
        
        exec.shutdown();
        
        // 觀察 pool 是否有關閉
        while (!exec.awaitTermination(1, TimeUnit.SECONDS)) {
            System.out.println("Pool 尚未關閉, 還有 Job 在執行中...");
        }
        
        System.out.println("Pool 已關閉, 全部 Job 已執行完畢!");
        
    }
}
