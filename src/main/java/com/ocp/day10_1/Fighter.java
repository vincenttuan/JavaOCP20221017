package com.ocp.day10_1;

public class Fighter extends Airplane implements Weapon {
    
    @Override
    public void speed() {
        System.out.println("F16速度2200km/h");
    }
    
    @Override
    public void shoot() {
        System.out.println("F16發射響尾蛇飛彈 ");
    }

}
