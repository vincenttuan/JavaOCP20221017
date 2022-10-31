package com.ocp.day5;

// 帳戶
public class Account {
    String name; // 戶名
    private int balance; // 帳戶餘額
    
    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    
    // 存款
    public boolean deposit(int amount) {
        if(amount > 0) { // 過濾 amount > 0
            balance += amount;
            return true;
        }
        return false;
    }
    
    // 提款
    public boolean withDraw(int amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
    
    // 設計一個轉帳(transfer)的方法
    public void transfer(Account ac2, int amount) {
        // ac1 先提款
        withDraw(amount);
        // ac2 再存款
        ac2.deposit(amount);
    }    
    
    public void printAccount() {
        System.out.println(name + " $" + balance);
    }
}
