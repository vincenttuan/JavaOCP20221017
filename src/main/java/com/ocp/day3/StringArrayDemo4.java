package com.ocp.day3;

import java.util.Arrays;

public class StringArrayDemo4 {
    public static void main(String[] args) {
        String str = "90, 85, 35, 53, 76";
        // 請計算及格人數的平均分數 ?
        // 字串轉數字
        // int x = Integer.parseInt("90"); // 將字串 "90" 轉成數字 90
        String[] scores = str.split(", "); // ["90", "85", "35", "53", "76"]
        // Java 8
        double avg = Arrays.stream(scores)
                           .mapToInt(score -> Integer.parseInt(score)) // .mapToInt(Integer::parseInt)
                           .filter(score -> score >= 60)
                           .average()
                           .getAsDouble();
        System.out.printf("avg = %.1f\n", avg);
        
    }
}
