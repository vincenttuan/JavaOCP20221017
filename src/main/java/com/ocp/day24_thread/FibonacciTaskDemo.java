package com.ocp.day24_thread;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class FibonacciTaskDemo {
    public static void main(String[] args) {
        int num = 50;
        long startTime, endTime;
        // 一般方法
        startTime = System.currentTimeMillis();
        long result = new Fibonacci().fib(num);
        endTime = System.currentTimeMillis();
        System.out.printf("一般方法: 第 %d 項 = %,d 花費時間: %dms\n", num, result, (endTime-startTime));
        // forkjoin
        ForkJoinTask<Long> task = new FibonacciTask(num);
        startTime = System.currentTimeMillis();
        long result2 = new ForkJoinPool(4).invoke(task);
        endTime = System.currentTimeMillis();
        System.out.printf("forkjoin方法: 第 %d 項 = %,d 花費時間: %dms\n", num, result2, (endTime-startTime));
        
    }
}
