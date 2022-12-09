package com.ocp.day16_map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo3 {
    
    public static void main(String[] args) {
        Student s1 = new Student(1, "John");
        Student s2 = new Student(2, "Mary");
        Student s3 = new Student(3, "Bob");
        Exam e1 = new Exam("Java", 100);
        Exam e2 = new Exam("Java", 80);
        Exam e3 = new Exam("Java", 75);
        
        Map<Student, Exam> map = new HashMap<>();
        map.put(s1, e1);
        map.put(s2, e2);
        map.put(s3, e3);
        
        System.out.println(map);
        
        int sum = map.entrySet()
                     .stream()
                     .mapToInt(entry -> entry.getValue().getScore())
                     .sum();
        System.out.println(sum);
        
        
    }
    
}
