package com.ocp.day3;

// 透過自訂方法來改變字串內容
public class StringDemo4 {
    public static void main(String[] args) {
        String language = "Java";
        language = add11(language);
        System.out.println("language = " + language); // 希望能夠印出 Java11
    }
    private static String add11(String str) {
        str = str + "11";
        System.out.println("str = " + str);
        return str;
    }
    
}
