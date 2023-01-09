package com.ocp.day24_thread;

public class FibonacciTaskDemo {
    public static void main(String[] args) {
        int num = 40;
        long startTime, endTime;
        // 一般方法
        startTime = System.currentTimeMillis();
        long result = new Fibonacci().fib(num);
        endTime = System.currentTimeMillis();
        System.out.printf("一般方法: 第 %d 項 = %,d 花費時間: %dms\n", num, result, (endTime-startTime));
    }
}
