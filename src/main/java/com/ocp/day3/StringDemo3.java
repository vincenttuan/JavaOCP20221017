package com.ocp.day3;

public class StringDemo3 {
    public static void main(String[] args) {
        String msg = "   she sell sea shell on the sea shore   ";
        msg = msg.trim(); // 去除左右邊所有半形空白
        System.out.println(msg);
        System.out.printf("字串長度: %d\n", msg.length());
        System.out.printf("substring(9, 12): %s\n", msg.substring(9, 12)); // 位置抓取 9 到小於 12
        
    }
}
