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
    public void deposit(int amount) {
        if(amount > 0) { // 過濾 amount > 0
            balance += amount;
        }
    }
    
    // 提款
    public void withDraw(int amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
    
    public void printAccount() {
        System.out.println(name + " $" + balance);
    }
}
