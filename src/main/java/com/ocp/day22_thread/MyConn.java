package com.ocp.day22_thread;

public class MyConn {
    
    public MyConn() {
        System.out.println("開啟連線");
    }
    
    public void printData() {
        System.out.println("資料取得....");
    }
    
    public void close() {
        System.out.println("關閉連線");
    }
    
}
