package com.ocp.day3;

public class StringBuilderDemo {
    public static void main(String[] args) {
        // StringBuffer/StringBuilder 可變字串
        // String 不可變字串
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb);
        sb.append("11"); // 最左邊不需要加 sb = 
        System.out.println(sb);
    }
}
