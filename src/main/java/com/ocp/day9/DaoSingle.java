package com.ocp.day9;

import java.util.Random;
// 單例模式(SingleTon)
public class DaoSingle {
    // 建立 private 類別物件
    private static DaoSingle _instance = new DaoSingle();
    private int number;
    
    private DaoSingle() { // 將建構子 private
        number = new Random().nextInt(100_0000);
    }
    // 建立 public 類別方法讓外界可以得到 _instance
    public static DaoSingle getInstance() {
        return _instance;
    }
    
    @Override
    public String toString() {
        return "DaoSingle{" + "number=" + number + '}';
    }
}
