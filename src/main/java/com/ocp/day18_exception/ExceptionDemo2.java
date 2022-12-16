package com.ocp.day18_exception;

import org.w3c.dom.ranges.RangeException;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        try {
            printScore(-40);
        } catch (RuntimeException e) {
            System.out.printf("錯誤訊息: %s\n", e.getMessage());
        }
        System.out.println("結束...");
    }
    
    // 印出 score 與是否及格
    public static void printScore(int score) {
        if (score < 0 || score > 100) {
            RuntimeException re = new RuntimeException("分數範圍錯誤"); // 創造一個例外
            throw re; // 拋出例外
        }
        boolean isPass = score >= 60;
        System.out.printf("%d %s\n", score, isPass?"及格":"不及格");
    }
}
