package com.ocp.day5;

public class OO8 {
    public static void main(String[] args) {
        Student[] stu1 = {
            new Student("John", 80),
            new Student("Mary", 40)
        };
        Student[] stu2 = {
            new Student("Bobo", 90),
            new Student("Jack", 70),
            new Student("Kita", 50),
        };
        Student[][] studentses = {stu1, stu2};
        System.out.println(studentses);
        // 印出及格者的平均分數 = ?
        
        
    }
}
