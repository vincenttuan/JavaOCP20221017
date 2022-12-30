package com.ocp.day22_sync;

// 提款執行緒
public class Withdraw implements Runnable {
    private Account account;
    private int amount;
    
    public Withdraw(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }
    
    @Override
    public void run() {
        account.withdraw(amount); // 提款去 
    }
    
}
