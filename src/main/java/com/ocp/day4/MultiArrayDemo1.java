package com.ocp.day4;

public class MultiArrayDemo1 {
    public static void main(String[] args) {
        int[][] x = new int[2][3];
        System.out.printf("x.length = %d\n", x.length);
        System.out.printf("x[0].length = %d\n", x[0].length);
        System.out.printf("x[1].length = %d\n", x[1].length);
        System.out.println(x);
        System.out.println(x[0]);
        System.out.println(x[1]);
        // 印出二維陣列資料 ?
        System.out.println("直接印出:");
        System.out.println(x[0][0]);
        System.out.println(x[0][1]);
        System.out.println(x[0][2]);
        System.out.println(x[1][0]);
        System.out.println(x[1][1]);
        System.out.println(x[1][2]);
        System.out.println("利用 for-loop 印出:");
        
    }
}
