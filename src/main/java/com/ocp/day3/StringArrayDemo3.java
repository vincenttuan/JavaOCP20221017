package com.ocp.day3;

public class StringArrayDemo3 {
    public static void main(String[] args) {
        String str = "90, 85, 35, 53, 76";
        // 請計算及格人數的平均分數 ?
        // 字串轉數字
        // int x = Integer.parseInt("90"); // 將字串 "90" 轉成數字 90
        String[] scores = str.split(", "); // ["90", "85", "35", "53", "76"]
        // Java 7
        int sum = 0; // 及格累計分數
        int count = 0; // 及格人數
        for(String score : scores) {
            int x = Integer.parseInt(score); // 字串轉數字
            if(x >= 60) {
                sum += x;
                count++;
            }
        }
        double avg = (double)sum / count;
        System.out.printf("avg = %.1f\n", avg);
        
    }
}
