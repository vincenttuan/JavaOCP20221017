package com.ocp.day18_exception;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        try {
            printScore(-40);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("結束...");
    }
    
    // 印出 score 與是否及格
    public static void printScore(int score) throws Exception {
        if (score < 0 || score > 100) {
            Exception re = new Exception("分數範圍錯誤"); // 創造一個例外
            throw re; // 拋出例外
        }
        boolean isPass = score >= 60;
        System.out.printf("%d %s\n", score, isPass?"及格":"不及格");
    }
}
