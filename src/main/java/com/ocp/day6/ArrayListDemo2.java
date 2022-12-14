package com.ocp.day6;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {
    // 利用類別變數存放所有的簽到資料
    static ArrayList<String> names = new ArrayList<>();
    
    // 程式進入點
    public static void main(String[] args) {
        while (true) {            
             menu();
        }
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
        System.out.println("6. 多筆(批次)新增");
        System.out.println("7. 根據人名來修改");
        System.out.println("8. 根據人名來刪除");
        System.out.println("9. 清空打卡資訊");
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
            case 6:
                batchAdd(); // 多筆(批次)新增 
                break;
            case 7:
                updateByName(); // 根據人名來修改    
                break;
            case 8:
                deleteByName(); // 根據人名來刪除
                break;
            case 9:
                clear(); // 清空打卡資訊
                break;
            case 0:
                exit(); // 離開
                break;
            default:
                // 發出聲音
                Toolkit.getDefaultToolkit().beep();
                System.out.println("無此選單, 請重新輸入...");
        }
        System.out.println("請按下 y 繼續 ...");
        scanner.next();
    }
    
    // 1. 簽到
    public static void add() {
        System.out.println("簽到");
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入人名: ");
        String name = scanner.next();
        names.add(name); // 將 name 加入到 names 集合中
        System.out.println("簽到完成");
    }
    
    // 2. 修改
    public static void update() {
        System.out.println("修改");
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入 index: ");
        int index = scanner.nextInt();
        System.out.print("請輸入修改後的人名: ");
        String updateName = scanner.next();
        names.set(index, updateName); // 修改
        System.out.println("修改完成");
    }
    
    // 3. 刪除
    public static void delete() {
        System.out.println("刪除");
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入 index: ");
        int index = scanner.nextInt();
        names.remove(index); // 移除
        System.out.println("刪除完成");
    }
    
    // 4. 單筆查詢
    public static void findOne() {
        System.out.println("單筆查詢");
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入 index: ");
        int index = scanner.nextInt();
        String name = names.get(index);
        System.out.println("人名: " + name);
    }
    
    // 5. 全部查詢
    public static void findAll() {
        System.out.println("全部查詢");
        System.out.println(names);
        System.out.println("資料筆數: " + names.size());
    }
    
    // 6. 多筆(批次)新增
    public static void batchAdd() {
        System.out.println("多筆(批次)新增");
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入人名(名字間請用空白隔開): ");
        String allname = scanner.nextLine(); // 讀取一整列
        String[] array = allname.split(" ");
        // 透過 for-each 逐筆新增到 names 中
        for(String name : array) {
            names.add(name);
        }
        System.out.println("多筆(批次)新增完成");
    }
    
    // 7. 根據人名來修改
    public static void updateByName() {
        System.out.println("根據人名來修改");
        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入要修改的人名(修改前 修改後): ");
        String pairName = scanner.nextLine();
        String[] array = pairName.split(" ");
        if(array.length == 2) {
            String beforeName = array[0];
            String afterName = array[1];
            for(int index=0;index<names.size();index++) {
                if(names.get(index).equals(beforeName)) {
                    names.set(index, afterName);
                    System.out.println("修改完成");
                    return; // 方法結束
                }
            }
        }
        System.out.println("修改失敗/查無此人");
    }
    
    // 8. 根據人名來刪除
    public static void deleteByName() {
        System.out.println("根據人名來刪除");
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入欲刪除的人名: ");
        String name = scanner.next();
        if(names.remove(name)) {
            System.out.println("刪除成功");
        } else {
            System.out.println("刪除失敗");
        }
    }
    
    // 9. 清空打卡資訊
    public static void clear() {
        System.out.print("是否要清空打卡資訊(y/n): ");
        Scanner scanner = new Scanner(System.in);
        String check = scanner.next();
        if(check.equalsIgnoreCase("y")) {
            names.clear();
            System.out.println("清空打卡資訊成功");
        }
    }
    
    // 0. 離開系統
    public static void exit() {
        // status: 0 表示結束當前正在運行的程式
        // status: 1 表示非正常結束
        System.out.println("離開系統");
        System.exit(0); 
    }
    
}
