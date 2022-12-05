package com.ocp.day15_treeset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        Set<Integer> mySet = new LinkedHashSet<>();
        mySet.add(5);
        mySet.add(8);
        mySet.add(1);
        mySet.add(3);
        mySet.add(4);
        mySet.add(9);
        mySet.add(7);
        mySet.add(6);
        System.out.println(mySet);
        // 要查詢時套換成 TreeSet
        mySet = new TreeSet<>(mySet);
        System.out.println(mySet);
        // 進行查詢程序
    }
}
