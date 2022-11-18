package com.ocp.day10_1;

public class Army {
    public static void main(String[] args) {
        Car car1 = new Truck();
        Car car2 = new Truck();
        Car car3 = new Truck();
        Car car4 = new Tank();
        Car car5 = new Tank();
        Car[] cars = {car1, car2, car3, car4, car5};
        
        Airplane airplane1 = new Drone();
        Airplane airplane2 = new Drone();
        Airplane airplane3 = new Fighter();
        Airplane[] airplanes = {airplane1, airplane2, airplane3};
        
        // 武器的有
        Weapon weapon1 = new Tank();
        Weapon weapon2 = new Fighter();
        //Weapon[] weapons = {weapon1, weapon2};
        Weapon[] weapons = {(Weapon)car4, (Weapon)car5, (Weapon)airplane3};
        // 所有武器齊發
        for(Weapon weapon : weapons) {
            weapon.shoot();
        }
        
        
    }
}
