package com.ocp.day14_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        // HashSet(元素無順序性), LinkedHashSet(元素有順序性)
        Set subject = new LinkedHashSet();
        subject.add("國文"); // String
        subject.add(100); // 是 Integer 非 int
        subject.add("數學");
        subject.add(70);
        subject.add("英文");
        subject.add(100);
        System.out.println(subject);
        // 走訪器: Iterator, 可以走訪每一個元素
        Iterator iter = subject.iterator(); // 得到 subject 的 走訪器
        while (iter.hasNext()) { // 是否還有元素
            Object next = iter.next();
            System.out.println("元素: " + next);
        }
        
    }
}
