package com.ocp.day17_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo4 {

    public static void main(String[] args) {
        int x = 10; // 分子
        Integer[] y = {2, 0, 5, null}; // 分母
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入分母 y 的 index(0, 1, 2, 3): ");
        
        // 先用字串取的使用者所輸入的資訊
        String str = scanner.next();    
        // 再判斷此字串是否都是數字
        boolean isNumeric = str.chars().allMatch(Character::isDigit);
        if(!isNumeric) {
            System.out.println("請輸入數字");
            return;
        }
        
        int index = Integer.valueOf(str);
        
        // index 是否在陣列範圍內
        if (index < 0 || index >= y.length) {
            System.out.println("index 不在陣列範圍內");
            return;
        }
        // 分母是否 = null
        if (y[index] == null) {
            System.out.println("分母是 null");
            return;
        }
        // 分母是否 = 0
        if (y[index] == 0) {
            System.out.println("分母是 0");
            return;
        }
        // 計算
        int result = x / y[index];
        System.out.println(result);

    }
}
