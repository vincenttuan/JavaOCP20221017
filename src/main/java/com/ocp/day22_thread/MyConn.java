package com.ocp.day22_thread;

import java.io.Closeable;
import java.io.IOException;

public class MyConn implements Closeable {
    
    public MyConn() {
        System.out.println("開啟連線");
    }
    
    public void printData() throws Exception{
        System.out.println("資料取得....");
    }

    @Override
    public void close() throws IOException {
        System.out.println("關閉連線");
    }
    
}
