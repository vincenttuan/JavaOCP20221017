package com.ocp.day18_exception;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        // finally
        printAvg(10, 0);
    }
    
    public static void printAvg(int x, int y) {
        int avg = 0;
        try {
            avg = x / y;
        } catch (Exception e) {
            System.out.println(e);
            return;
        } finally {
            System.out.printf("一定要執行 avg = %d\n", avg); // 一定要執行
        }
        System.out.printf("應該會執行 avg = %d\n", avg); // 應該會執行
    }
}
