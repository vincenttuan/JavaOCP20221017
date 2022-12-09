package com.ocp.day16_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("國文", 100);
        map.put("數學", 80);
        map.put("英文", 75);
        System.out.println(map);
        Set<String> keys = map.keySet();
        for(String key : keys) {
            System.out.println(key + " = " + map.get(key));
        }
        
        map.entrySet()
           .forEach((entry) -> System.out.println(entry.getKey() + " : " + entry.getValue()));
        
    }
}
