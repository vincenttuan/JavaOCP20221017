package com.ocp.day3;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = new String("jAvA");
        System.out.println(s1 == s2); // false (不同的物件位置)
        System.out.println(s1.equals(s2)); // true (大小寫均符合)
        System.out.println(s1.equals(s3)); // false (大小寫不符合)
        System.out.println(s1.equalsIgnoreCase(s3)); // true (大小寫不拘)
        
    }
}
