package com.ocp.day17_exception;

import java.util.Scanner;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int x = 10; // 分子
        Integer[] y = {2, 0, 5, null}; // 分母
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入分母 y 的 index(0, 1, 2, 3): ");
        
        try {
            int index = scanner.nextInt();
            int result = x / y[index];
            System.out.println(result);
        } catch(ArithmeticException ae) {
            System.out.println("發生了數學錯誤, 處理方式...");
            System.out.println(ae);
        } catch(NullPointerException ne) {
            System.out.println("發生了空指針NULL錯誤, 處理方式...");
            System.out.println(ne);
        } catch(ArrayIndexOutOfBoundsException ae) {
            System.out.println("發生了陣列超過範圍錯誤, 處理方式...");
            System.out.println(ae);
        } catch (Exception e) { // 其他錯誤發生統一處理
            System.out.println("發生了其他錯誤, 處理方式...");
            System.out.println(e);
        }
        
    }
}
