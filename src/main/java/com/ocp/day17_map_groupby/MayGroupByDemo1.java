package com.ocp.day17_map_groupby;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MayGroupByDemo1 {
    
    public static void main(String[] args) {
        
        List<String> fruits = 
                Arrays.asList("apple", "apple", "banana", "orange", "orange", "apple", "papaya", "papaya", "watermelon");
        
        // 每一種水果有幾個
        // {papaya=2, orange=2, banana=1, apple=3, watermelon=1}
        Map<String, Long> result = fruits.stream()
                                         .collect(
                                             Collectors.groupingBy(
                                                 //name -> name, Collectors.counting()
                                                 Function.identity(), Collectors.counting()
                                             )
                                         );
        
        System.out.println(result);
        // 在 result 中根據 value 大小排序
        // 原本: {papaya=2, orange=2, banana=1, apple=3, watermelon=1}
        // 變為: {banana=1, watermelon=1, papaya=2, orange=2, apple=3}
        result.entrySet().stream()
                //.sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .sorted(Map.Entry.<String, Long>comparingByValue())
                .forEachOrdered(e -> System.out.println(e));
        
        Map<String, Long> resultSortedMap = new LinkedHashMap<>();
        result.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEachOrdered(e -> resultSortedMap.put(e.getKey(), e.getValue()));
        System.out.println(resultSortedMap);
    }
    
}
