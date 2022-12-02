package com.ocp.day14_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo3 {
    public static void main(String[] args) {
        Set<Set<Number>> values = new LinkedHashSet<>();
        Set<Number> item1 = new LinkedHashSet<>();
        Set<Number> item2 = new LinkedHashSet<>();
        Set<Number> item3 = new LinkedHashSet<>();
        item1.add(100);item1.add(0.5);
        item2.add(500);item2.add(0.2);
        item3.add(1000);item3.add(0.1);
        values.add(item1);
        values.add(item2);
        values.add(item3);
        System.out.println(values); // [[100, 0.5], [500, 0.2], [1000, 0.1]]
        // 是計算出每個 item 元素相乘之後的總和 = ?
        
    }
}
