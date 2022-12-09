package com.ocp.day16_map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class MapDemo7 {
    public static void main(String[] args) {
        // 起初先建立 200 個空間, 用到 80% 就會自動增長
        Hashtable<String, Integer> tables = new Hashtable<>(200, 0.8f);
        tables.put("A", 100);
        tables.put("C", 90);
        tables.put("B", 80);
        tables.put("B", 40);
        System.out.println(tables);
        // 走訪器 Enumeration
        Enumeration<Integer> values = tables.elements();
        while (values.hasMoreElements()) {
            Integer value = values.nextElement();
            System.out.println(value);
        }
        
        
        
    }
}
