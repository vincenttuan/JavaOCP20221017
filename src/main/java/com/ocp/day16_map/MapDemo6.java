package com.ocp.day16_map;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo6 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new TreeMap<>(); // 按照 key 排序
        map.put(3, 100);
        map.put(1, 90);
        map.put(2, 80);
        System.out.println(map);
        
        Map<Exam, String> exams = new TreeMap<>();
        exams.put(new Exam("Java", 100), "John");
        exams.put(new Exam("Java", 80), "Mary");
        exams.put(new Exam("Java", 90), "Bob");
        System.out.println(exams);
        
    }
}
