package com.ocp.day10_1;

public class Tank extends Car implements Weapon {
    
    @Override
    public void move() {
        System.out.println("坦克是用履帶走的");
    }
    
    @Override
    public void shoot() {
        System.out.println("坦克發射穿甲彈");
    }

}
