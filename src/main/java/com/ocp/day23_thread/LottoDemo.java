package com.ocp.day23_thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class LottoDemo {
    public static void main(String[] args) {
        //ThreadPoolExecutor exec = (ThreadPoolExecutor)Executors.newCachedThreadPool();
        ThreadPoolExecutor exec = (ThreadPoolExecutor)Executors.newFixedThreadPool(2);
        int i = 100;
        while( i-- > 0) {
            exec.submit(new Lotto());
        }
        System.out.println("Thread count: " + Thread.activeCount());
        // 關閉服務
        exec.shutdown();
        
    }
}
