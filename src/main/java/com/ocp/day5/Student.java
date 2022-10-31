package com.ocp.day5;

public class Student {
    // 物件變數
    String name;
    int score;
    // 無參數建構子
    public Student() {
        System.out.println("建立 Student 物件");
    }
    // 有參數建構子
    public Student(String myName, int myScore) {
        name = myName;
        score = myScore;
    }
}
