package com.ocp.day11_1;

public class EqualsTest2 {
    public static void main(String[] args) {
        Pen p1 = new Pen("red", 10);
        Pen p2 = new Pen("red", 10);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }
}
