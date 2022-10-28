package com.ocp.day4;

public class MultiArrayDemo1 {
    public static void main(String[] args) {
        int[][] x = new int[2][3];
        System.out.printf("x.length = %d\n", x.length);
        System.out.printf("x[0].length = %d\n", x[0].length);
        System.out.printf("x[1].length = %d\n", x[1].length);
        System.out.println(x); // [[I@1888ff2c
        System.out.println(x[0]); // [I@35851384
        System.out.println(x[1]); // [I@649d209a
        // 印出二維陣列資料 ?
        System.out.println("直接印出:");
        System.out.println(x[0][0]);
        System.out.println(x[0][1]);
        System.out.println(x[0][2]);
        System.out.println(x[1][0]);
        System.out.println(x[1][1]);
        System.out.println(x[1][2]);
        System.out.println("利用 for-loop 印出:");
        for(int i=0;i<x.length;i++) {
            System.out.println(x[i]);
            // 分析一維陣列 x[i]
            for(int k=0;k<x[i].length;k++) {
                System.out.println(x[i][k]);
            }
        }
        System.out.println("利用 for-each 印出:");
        for(int[] y : x) {
            System.out.println(y); // 一維陣列
            for(int value : y) {
                System.out.println(value);
            }
        }
    }
}
