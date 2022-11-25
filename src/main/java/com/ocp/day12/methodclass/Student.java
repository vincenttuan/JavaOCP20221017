package com.ocp.day12.methodclass;

public class Student {
    private String name;
    public Student(String name) {
        this.name = name;
    }
    
    public void printExam() {
        String name = "Java"; // 考試科目
        class Exam {
            int score = 90;
            @Override
            public String toString() {
                return name + ": " + score;
            }
        }
        Exam exam = new Exam();
        System.out.println(exam);
    }
    
}
