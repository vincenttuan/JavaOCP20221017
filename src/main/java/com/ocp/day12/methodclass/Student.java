package com.ocp.day12.methodclass;

public class Student {
    private String name; // 學生姓名
    public Student(String name) {
        this.name = name;
    }
    
    public void printExam() {
        // 區域變數若要給方法內部類別使用, 則該變數就必須具備 final 的特性
        String subject = "Java"; // 考試科目
        class Exam { // 方法內部類別
            int score = 90; // 考試成績
            @Override
            public String toString() {
                return name + ", " + subject + ", " + score;
            }
        }
        Exam exam = new Exam();
        System.out.println(exam);
        
    }
    
}
