package com.ocp.day8;

// 超/多載
public class Overloading {
    
    public static void printPow(double x) {
        System.out.println("A");
        System.out.println(Math.pow(x, 2));
    }
    public static void printPow(int x) {
        System.out.println("B");
        System.out.println(Math.pow(x, 2));
    }
    public static void printPow(Integer x) {
        System.out.println("C");
        System.out.println(Math.pow(x, 2));
    }
    public static void printPow(float x) {
        System.out.println("D");
        System.out.println(Math.pow(x, 2));
    }
    
    public static void main(String[] args) {
        printPow(10);
    }
}
