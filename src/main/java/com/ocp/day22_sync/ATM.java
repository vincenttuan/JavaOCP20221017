package com.ocp.day22_sync;

public class ATM {
    public static void main(String[] args) {
        Account account = new Account(10000);
        // 提款工作
        Runnable job1 = new Withdraw(account, 5000);
        Runnable job2 = new Withdraw(account, 4000);
        Runnable job3 = new Withdraw(account, 3000);
        // 派人去提款
        Thread t1 = new Thread(job1, "T1");
        Thread t2 = new Thread(job2, "T2");
        Thread t3 = new Thread(job3, "T3");
        // 開始執行
        t1.start();
        t2.start();
        t3.start();
    }
}
