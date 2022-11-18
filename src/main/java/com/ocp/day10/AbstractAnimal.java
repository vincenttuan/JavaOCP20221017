package com.ocp.day10;

// 抽象類別
public abstract class AbstractAnimal implements Animal {

    @Override
    public void eat() {
        System.out.println("罐頭飼料");
    }
    
}
