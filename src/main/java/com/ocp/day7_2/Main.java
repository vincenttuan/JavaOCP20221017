package com.ocp.day7_2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", 18, 90);
        System.out.println(student);
        
        Student student2 = new Student("Mary", 17, 75);
        System.out.println(student2);
        
        Teacher teacher = new Teacher("Helen", 30, 70000);
        System.out.println(teacher);
    }
}
