package com.ocp.day16_map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("國文", 100);
        map.put("數學", 80);
        map.put("英文", 75);
        System.out.println(map);
        System.out.println(map.get("英文"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        map.remove("英文");
        System.out.println(map);
        System.out.println(map.get("社會"));
    }
}
