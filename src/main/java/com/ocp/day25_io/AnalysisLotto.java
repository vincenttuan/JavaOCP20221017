package com.ocp.day25_io;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class AnalysisLotto {
    public static void main(String[] args) {
        String data = "12, 38, 10, 39, 7, 36, 28, 13, 37, 26, 38, 4, 31, 2, 18, 8, 1, 17, 20, 9, 31, 39, 13, 36, 24, 4, 23, 24, 7, 1, 1, 3, 8, 12, 25, 26, 2, 32, 4, 19, 13, 12, 29, 37, 30, 18, 24, 33, 17, 10, 18, 26, 10, 25, 16, 24, 28, 27, 25, 12, 12, 28, 21, 8, 14, 11, 31, 17, 32, 35, 30, 29, 27, 22, 8, 31, 27, 3, 15, 18, 2, 29, 8, 3, 22, 17, 21, 35, 13, 14, 9, 21, 37, 20, 34, 39, 37, 19, 32, 1, 35, 15, 14, 25, 12, 23, 21, 19, 9, 29, 9, 25, 15, 10, 29, 15, 3, 17, 39, 11, 23, 14, 12, 27, 38, 22, 28, 12, 3, 39, 1, 30, 39, 25, 3, 8, 33, 23, 17, 21, 14, 38, 29, 8, 17, 35, 8, 23, 34, 18, 33, 17, 10, 38, 5, 38, 3, 19, 1, 7, 3, 7, 24, 34, 39, 9, 14, 36, 17, 16, 21, 38, 33, 11, 20, 24, 28, 30, 2, 32, 19, 33, 29, 34, 37, 33, 35, 31, 18, 24, 22, 4, 17, 1, 29, 5, 27, 30, 22, 18, 7, 13, 16, 1, 26, 8, 9, 7, 16, 24, 6, 16, 31, 20, 29, 28, 7, 12, 2, 24, 20, 31, 27, 24, 28, 8, 13, 7, 23, 27, 38, 39, 22, 33, 4, 22, 31, 26, 19, 36, 12, 23, 34, 18, 11, 13, 36, 10, 39, 24, ";
        //String data = "1, 2, 4, 2, 5, 4";
        String[] array = data.split(", ");
        System.out.println(data.length());
        
        Map<String, Integer> map = new LinkedHashMap<>();
        IntStream.rangeClosed(1, 39).forEach(i -> {
            map.put(i+"", 0);
        });
        System.out.println(map);
        
        // 比對
        for(String key : array) {
            map.put(key, map.get(key) + 1);
        }
        System.out.println(map);
    }
}
