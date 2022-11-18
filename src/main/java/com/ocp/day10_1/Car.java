package com.ocp.day10_1;

public abstract class Car {
    public void printName() {
        System.out.println("我是車");
    }
    // 抽象類別中的抽象方法一定要加上 abstract
    public abstract void move();
}
 
