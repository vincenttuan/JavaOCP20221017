package com.ocp.day3;

import java.util.Arrays;

public class StringArrayDemo {
    public static void main(String[] args) {
        String str = "John, Mary, Vincent, Jo, Helen";
        System.out.println(str);
        // 利用 split() 來切割字串變成 String[]
        String[] names = str.split(", ");
        System.out.println(Arrays.toString(names));
        System.out.println(str.length()); // 字串長度
        System.out.println(names.length); // 陣列長度
        // 請問平均名字有幾個字(取到小數點一位)?
        // Java 7
        int total = 0;
        for(String name : names) {
            total += name.length();
        }
        System.out.printf("total = %d\n", total);
        double avg = (double)total / names.length;
        System.out.printf("avg = %.1f\n", avg);
    }
}
