package com.ocp.day21_runnable;

public class RunnableExec {
    public static void main(String[] args) {
        // 建立執行緒的工作有哪些...
        Runnable job1 = new Walker();
        Runnable job2 = new Runner();
        
        // 建立一個空的執行緒並指派工作給他
        Thread t1 = new Thread(job2, "John");
        Thread t2 = new Thread(job1, "Mary");
        
        // start 開始執行
        t1.start();
        t2.start();
        
    }
}
