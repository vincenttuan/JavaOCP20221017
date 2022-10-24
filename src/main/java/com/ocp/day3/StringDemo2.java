package com.ocp.day3;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = "Java";
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.intern() == s2); // true (intern() -> 放到 String pool 中)
        
    }
}
