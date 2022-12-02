package com.ocp.day14_set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo2 {
    public static void main(String[] args) {
        // 加入泛型 <> 限制
        Set<Number> scores = new LinkedHashSet<>();
        scores.add(100);
        scores.add(null);
        scores.add(80);
        scores.add(70);
        System.out.println(scores);
        // 將 null 元素移除(remove)
        Iterator<Number> iter2 = scores.iterator();
        while (iter2.hasNext()) {
            if(iter2.next() == null) {
                iter2.remove();
            }
        }
        System.out.println(scores);
        // 計算總分
        int sum = 0;
        Iterator<Number> iter = scores.iterator();
        while (iter.hasNext()) {
            sum += iter.next().intValue();
        }
        System.out.println(sum);
        
        //int sum2 = scores.stream().mapToInt(next -> next.intValue()).sum();
        int sum2 = scores.stream().mapToInt(Number::intValue).sum();
        System.out.println(sum2);
        
    }
}
