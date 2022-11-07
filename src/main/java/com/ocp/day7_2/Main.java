package com.ocp.day7_2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", 18, 90);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getScore());
        System.out.println(student);
    }
}
