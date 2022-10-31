package com.ocp.day5;

public class OO6 {
    public static void main(String[] args) {
        Student[] students = {
            new Student("John", 80),
            new Student("Mary", 40),
            new Student("Bobo", 90),
            new Student("Jack", 70),
            new Student("Kita", 50),
        };
        System.out.println(students);
        // for-loop
        for(int i=0, len=students.length ; i<len ; i++) {
            students[i].printStudentData();
        }
        // for-each
        for(Student student : students) {
            student.printStudentData();
        }
    }
}
