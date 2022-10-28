package com.ocp.day4;

import java.util.Arrays;

public class MultiArrayDemo6 {
    public static void main(String[] args) {
        // 3 個學生[國文, 數學]的成績如下
        int[][] scores = {{100, 90}, {85, 70}, {95, 40}};
        // 所有成績的加總 = ?
        // 利用 Java stream 來進行分析
        // {{100, 90}, {85, 70}, {95, 40}} -> {100, 90, 85, 70, 95, 40};
        int sum = Arrays.stream(scores) // 二維陣列串流
                        .flatMapToInt(array -> Arrays.stream(array)) // 一維陣列串流
                        .sum();
        System.out.println(sum);
    }
}
