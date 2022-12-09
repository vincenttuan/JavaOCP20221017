package com.ocp.day16_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapDemo4 {
    
    public static void main(String[] args) {
        Student s1 = new Student(1, "John");
        Student s2 = new Student(2, "Mary");
        Student s3 = new Student(3, "Bob");
        Exam e1 = new Exam("Java", 100);
        Exam e2 = new Exam("Java", 40);
        Exam e3 = new Exam("Java", 75);
        
        Map<Student, Exam> map = new HashMap<>();
        map.put(s1, e1);
        map.put(s2, e2);
        map.put(s3, e3);
        
        System.out.println(map);
        
        // 收集及格的 List<Exam> 集合
        List<Exam> passExams = new ArrayList<>();
        for(Entry<Student, Exam> entry : map.entrySet()) {
            Exam exam = entry.getValue();
            if(exam.getScore() >= 60) {
                passExams.add(exam);
            }
        }
        System.out.println(passExams);
        // 利用 Java 8 collect()
        List<Exam> passExams2 = map.entrySet()
                                   .stream()
                                   .filter(e -> e.getValue().getScore() >= 60)
                                   .map(Entry::getValue)
                                   .collect(Collectors.toList());
        System.out.println(passExams2); // 考試及格的成績列表
        
        List<Student> passStudent = map.entrySet()
                                   .stream()
                                   .filter(e -> e.getValue().getScore() >= 60)
                                   .map(Entry::getKey)
                                   .collect(Collectors.toList());
        System.out.println(passStudent); // 考試及格的學生列表
                
                
        
        
    }
    
}
