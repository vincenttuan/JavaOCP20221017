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
            //return; // finally 區段仍會執行
            System.exit(1); // 0: 正常離開(資源都將會被釋放), 1: 非正常離開(一般都寫在 catch 區段中)
        } finally {
            System.out.printf("一定要執行 avg = %d\n", avg); // 一定要執行
        }
        System.out.printf("應該會執行 avg = %d\n", avg); // 應該會執行
    }
}
