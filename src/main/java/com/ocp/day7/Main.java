package com.ocp.day7;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setAge(18);
        student.setScore(90);
        
        Teacher teacher = new Teacher();
        teacher.setName("Helen");
        teacher.setAge(30);
        teacher.setSalary(70000);
        
        System.out.println(student.getName() + ", " + student.getAge() + ", " + student.getScore());
        student.job();
        
        System.out.println(teacher.getName() + ", " + teacher.getAge() + ", " + teacher.getSalary());
        teacher.job();
        
        System.out.println(student); // student.toString();
        System.out.println(teacher); // teacher.toString();
    }
}
