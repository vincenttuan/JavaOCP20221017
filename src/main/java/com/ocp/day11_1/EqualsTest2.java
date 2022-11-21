package com.ocp.day11_1;

public class EqualsTest2 {
    public static void main(String[] args) {
        Pen p1 = new Pen("red", 10);
        Pen p2 = new Pen("red", 10);
        Pen p3 = new Pen("blue", 20);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p1));
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals("Java"));
        System.out.println(p1.equals(p3));
        
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
    }
}
