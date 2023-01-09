package com.ocp.day24_thread;

import java.util.concurrent.RecursiveTask;

public class FibonacciTask extends RecursiveTask<Long>{
    private static final int THRESHOLD = 30;
    private int num;
    public FibonacciTask(int num) {
        this.num = num;
    }

    @Override
    protected Long compute() {
        if(num < THRESHOLD) {
            return new Fibonacci().fib(num); // 直接遞迴求解
        }
        // 任務拆分 fork
        FibonacciTask subTask1 = new FibonacciTask(num - 1);
        FibonacciTask subTask2 = new FibonacciTask(num - 2);
        invokeAll(subTask1, subTask2);
        // 任務回報 join
        long subResult1 = subTask1.join();
        long subResult2 = subTask2.join();
        return subResult1 + subResult2;
    }
    
}
