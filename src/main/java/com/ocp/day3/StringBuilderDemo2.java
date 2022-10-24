package com.ocp.day3;

// 透過自訂方法來改變字串內容
public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder language = new StringBuilder("Java");
        add11(language); // 不用寫成 language = add11(language);
        System.out.println(language); // 印出 Java11
    }
    private static void add11(StringBuilder sb) {
        sb.append("11");
        // 不用回傳
    }
}
