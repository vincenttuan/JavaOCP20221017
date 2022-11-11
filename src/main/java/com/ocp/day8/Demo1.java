package com.ocp.day8;

class Father {

    Father() {
        this(10);
        System.out.println("A");
    }
    
    Father(int x) {
        System.out.println("B");
    }
}

class Son extends Father {
    Son() {
        this(10);
        System.out.println("C");
    }
    Son(int x) {
        super();
        System.out.println("D");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Son son = new Son(10);
    }
}
