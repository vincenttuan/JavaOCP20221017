package com.ocp.day10;

public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("罐頭飼料");
    }

    @Override
    public void play() {
        System.out.println("玩球");
    }
    
}
