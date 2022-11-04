package com.ocp.day6;

import java.util.Scanner;

public class ArrayListDemo2 {
    // 程式進入點
    public static void main(String[] args) {
        
    }
    
    // 系統功能目錄
    public static void menu() {
        System.out.println("簽到系統");
        System.out.println("----------------");
        System.out.println("1. 簽到");
        System.out.println("2. 修改");
        System.out.println("3. 刪除");
        System.out.println("4. 單筆查詢");
        System.out.println("5. 全部查詢");
        System.out.println("0. Exit");
        System.out.println("----------------");
        System.out.print("請選擇: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt(); // 得到使用者所輸入的選項
        switch (choice) {
            case 1:
                add(); // 簽到
                break;
            case 2:
                update(); // 修改
                break;
            case 3:
                delete(); // 刪除
                break;
            case 4:
                findOne(); // 單筆查詢
                break;
            case 5:
                findAll(); // 全部查詢
                break;
            case 0:
                exit(); // 離開
                break;
        }
        System.out.println("請按下 y 繼續 ...");
        scanner.next();
    }
    
    // 簽到
    public static void add() {
        System.out.println("簽到");
    }
    
    // 修改
    public static void update() {
        System.out.println("修改");
    }
    
    // 刪除
    public static void delete() {
        System.out.println("刪除");
    }
    
    // 單筆查詢
    public static void findOne() {
        System.out.println("單筆查詢");
    }
    
    // 全部查詢
    public static void findAll() {
        System.out.println("全部查詢");
    }
    
    // 離開系統
    public static void exit() {
        // status: 0 表示結束當前正在運行的程式
        // status: 1 表示非正常結束
        System.out.println("離開系統");
        System.exit(0); 
    }
    
}
