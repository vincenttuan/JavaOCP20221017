package com.ocp.day11_1;

public class EqualsTest {
    public static void main(String[] args) {
        // ==, equals()
        String s1 = "Java";
        String s2 = new String("Java");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
