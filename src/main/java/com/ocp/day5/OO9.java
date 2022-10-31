package com.ocp.day5;

public class OO9 {
    public static void main(String[] args) {
        Account ac1 = new Account("John", 10000);
        Account ac2 = new Account("Mary", 10000);
        ac1.printAccount();
        // 存款 $500
        ac1.deposit(500);
        ac1.printAccount();
        // 提款 $3000
        ac1.withDraw(3000);
        ac1.printAccount();
        // John 轉給 Mary 4000 元
        
    }
}
