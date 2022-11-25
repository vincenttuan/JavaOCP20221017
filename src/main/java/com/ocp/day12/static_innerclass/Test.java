package com.ocp.day12.static_innerclass;

public class Test {
    public static void main(String[] args) {
        // 一般內部類別調用
        Outer outer = new Outer();
        Outer.Inner in = outer.new Inner();
        in.printA();
        
        Outer.Inner in2 = new Outer().new Inner();
        in2.printA();
        
        new Outer().new Inner().printA();
        
        // 靜態(static)內部類別調用
        Outer.SInner sin = new Outer.SInner();
        sin.printB();
    }
}
