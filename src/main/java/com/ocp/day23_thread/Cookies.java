package com.ocp.day23_thread;

public class Cookies {
    
    private boolean empty = true; // 預設盤子是空的
    
    public synchronized void eat(int n) throws InterruptedException { // 吃第 n 塊餅乾
        if(empty) { // 若盤子為空
            wait(); // 小狗進入等待 
        }
        System.out.printf("小狗吃第 %d 片餅乾!\n", n);
        empty = true; // 將盤子為空
        notify(); // 通知主人放餅乾
    }
    
    public synchronized void put(int n) throws InterruptedException { // 放第 n 塊餅乾
        if(!empty) { // 若盤子非空 
            wait(); //  主人進入等待
        }
        System.out.printf("主人放第 %d 片餅乾!\n", n);
        empty = false; // 將盤子非空
        notify(); // 通知小狗吃餅乾
    }
    
}
