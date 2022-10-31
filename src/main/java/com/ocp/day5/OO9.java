package com.ocp.day5;

public class OO9 {
    public static void main(String[] args) {
        Account ac1 = new Account("John", 10000);
        ac1.printAccount();
        // 存款 $500
        ac1.deposit(500);
        ac1.printAccount();
    }
}
