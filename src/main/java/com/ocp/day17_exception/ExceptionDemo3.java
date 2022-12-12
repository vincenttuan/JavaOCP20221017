package com.ocp.day17_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        int x = 10; // 分子
        Integer[] y = {2, 0, 5, null}; // 分母
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入分母 y 的 index(0, 1, 2, 3): ");
        
        try {
            int index = scanner.nextInt();
            // index 是否在陣列範圍內
            if(index < 0 || index >= y.length) {
                System.out.println("index 不在陣列範圍內");
                return;
            }
            // 分母是否 = null
            if(y[index] == null) {
                System.out.println("分母是 null");
                return;
            }
            // 分母是否 = 0
            if(y[index] == 0) {
                System.out.println("分母是 0");
                return;
            }
            // 計算
            int result = x / y[index];
            System.out.println(result);
        } catch (InputMismatchException e) { // 輸入錯誤發生
            System.out.println("輸入錯誤發生, 處理方式...");
            System.out.println(e);
        }
        
    }
}
