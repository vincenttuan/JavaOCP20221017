package com.ocp.day12.methodclass;

public class Student {
    private String name; // 學生姓名
    public Student(String name) {
        this.name = name;
    }
    
    public void printExam() {
        String subject = "Java"; // 考試科目
        class Exam {
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
