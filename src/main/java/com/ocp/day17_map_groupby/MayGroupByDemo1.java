package com.ocp.day17_map_groupby;

import java.util.Arrays;
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
        
    }
    
}
