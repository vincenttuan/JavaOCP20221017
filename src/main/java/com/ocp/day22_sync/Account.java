package com.ocp.day22_sync;

public class Account {

    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(int amount) {
        String threadName = Thread.currentThread().getName();
        System.out.printf("%s 提款 $%d 目前餘額: $%d\n", threadName, amount, balance);
        if (balance >= amount) {
            for (int i = 0; i < Integer.MAX_VALUE; i++); // 模擬提款的運作時間
            // 減去提款金額
            balance = balance - amount;
            System.out.printf("%s 提款 $%d (成功) 目前餘額: $%d\n", threadName, amount, balance);
        } else {
            System.out.printf("%s 提款 $%d (餘額不足) 目前餘額: $%d\n", threadName, amount, balance);
        }
    }

    public void withdraw2(int amount) {
        String threadName = Thread.currentThread().getName();

        synchronized (this) {
            System.out.printf("%s 提款 $%d 目前餘額: $%d\n", threadName, amount, balance);
            if (balance >= amount) {
                for (int i = 0; i < Integer.MAX_VALUE; i++); // 模擬提款的運作時間
                // 減去提款金額
                balance = balance - amount;
                System.out.printf("%s 提款 $%d (成功) 目前餘額: $%d\n", threadName, amount, balance);
            } else {
                System.out.printf("%s 提款 $%d (餘額不足) 目前餘額: $%d\n", threadName, amount, balance);
            }
        }

    }

}
