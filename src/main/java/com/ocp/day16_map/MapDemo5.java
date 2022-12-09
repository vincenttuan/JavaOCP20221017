package com.ocp.day16_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapDemo5 {
    
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
        
        // 轉換 Map<String, Integer> 學生姓名, 成績
        // 注意在撰寫時可能 IDE 不會提示(寫完要 save 錯誤紅線才會消失)
        Map<String, Integer> map2 = map.entrySet()
                                       .stream()
                                       .collect(Collectors.toMap(
                                            e -> e.getKey().getName(),
                                            e -> e.getValue().getScore()
                                        ));
        System.out.println(map2);
        
    }
    
}
