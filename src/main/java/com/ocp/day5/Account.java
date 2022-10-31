package com.ocp.day5;

// 帳戶
public class Account {
    String name; // 戶名
    int balance; // 帳戶餘額
    
    public Account(int balance) {
        this.balance = balance;
    }
    
    public void printAccount() {
        System.out.println(name + " $" + balance);
    }
}
