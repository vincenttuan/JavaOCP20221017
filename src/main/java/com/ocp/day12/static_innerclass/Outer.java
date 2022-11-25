package com.ocp.day12.static_innerclass;

public class Outer {
    int x = 7;
    static int y = 100;
    
    // 一般內部類別(不可以有類別(static)成員)
    public class Inner {
        public void printA() {
            System.out.println("print A");
            System.out.println(Outer.this.x); // x, Outer.this.x
            System.out.println(Outer.y); // y, Outer.y
        }
    }
    
    // 靜態(static)內部類別
    public static class SInner {
        public static void printB() {
            System.out.println("print B");
            //System.out.println(Outer.this.x); // 不可存取外部類別的物件變數
            System.out.println(Outer.y); // y, Outer.y
        }
    }
    
    
}
