package com.ocp.day10;

public interface Animal {
    String COPY_RIGHT = "ABC.com"; // public static final String COPY_RIGHT = "ABC.com";
    void eat(); // public abstract void eat();
    void play(); // public abstract void eat();
    // Java 8 之後介面中有實作的方法要加上 default 來修飾
    default void copyRight() {
        System.out.println("ABC 版權所有");
    }
}
