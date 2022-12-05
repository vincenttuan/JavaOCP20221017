package com.ocp.day15_list;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入: \"h 170.0 w 60 請計算 bmi = ?\" ");
        String word1 = scanner.next();
        double h = scanner.nextDouble();
        String word2 = scanner.next();
        int w = scanner.nextInt();
        String otherWords = scanner.nextLine();
        System.out.println(word1);
        System.out.println(h);
        System.out.println(word2);
        System.out.println(w);
        System.out.println(otherWords);
        
        
    }
}
