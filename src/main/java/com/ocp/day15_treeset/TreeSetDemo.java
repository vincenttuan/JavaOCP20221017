package com.ocp.day15_treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        
        Set<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(5);
        sortedSet.add(8);
        sortedSet.add(1);
        sortedSet.add(3);
        sortedSet.add(4);
        sortedSet.add(9);
        sortedSet.add(7);
        sortedSet.add(6);
        System.out.println(sortedSet); // [1, 3, 4, 5, 6, 7, 8, 9] 元素內容會自動自然排序
        
    }
}
