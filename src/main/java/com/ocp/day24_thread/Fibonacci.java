package com.ocp.day24_thread;

public class Fibonacci {
    public long fib(int n) {
        if(n < 2) return n;
        return fib(n-1) + fib(n-2);
    }
}
