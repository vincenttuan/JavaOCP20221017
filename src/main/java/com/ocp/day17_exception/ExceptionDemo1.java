package com.ocp.day17_exception;

import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        int x = 10; // 分子
        Integer[] y = {2, 0, 5, null}; // 分母
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入分母 y 的 index(0, 1, 2, 3): ");
        
        try {
            int index = scanner.nextInt();
            int result = x / y[index];
            System.out.println(result);
        } catch (Exception e) { // 統一獲取錯誤, 統一處理
            System.out.println(e);
        }
        
    }
}
