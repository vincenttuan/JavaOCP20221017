package com.ocp.day10_1;

public interface Weapon {
    // Java 8 之後可以利用 default 修飾方法, 該方法就可以有實作
    public default void printName() {
        System.out.println("我是武器");
    }
    public abstract void shoot();
}
 
