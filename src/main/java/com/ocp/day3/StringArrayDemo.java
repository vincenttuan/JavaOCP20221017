package com.ocp.day3;

public class StringArrayDemo {
    public static void main(String[] args) {
        String str = "John, Mary, Vincent, Jo, Helen";
        // 利用 split() 來切割字串變成 String[]
        String[] names = str.split(", ");
        System.out.println(str.length()); // 字串長度
        System.out.println(names.length); // 陣列長度
        
    }
}
