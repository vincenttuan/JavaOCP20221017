package com.ocp.day9_3;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Tiger tiger = new Tiger();
        cat.叫聲();
        tiger.叫聲();
        System.out.println(cat.name);
        System.out.println(tiger.name);
    }
}
