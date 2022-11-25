package com.ocp.day12.static_innerclass;

public class Outer {
    int x = 7;
    static int y = 100;
    
    // 一般內部類別(不可以有類別(static)成員)
    public class Inner {
        public void printA() {
            System.out.println("print A");
        }
    }
    
    // 靜態(static)內部類別
    public static class SInner {
        public static void printB() {
            System.out.println("print B");
        }
    }
    
    
}
