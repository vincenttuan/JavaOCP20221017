package com.ocp.day14_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        // HashSet(元素無順序性), LinkedHashSet(元素有順序性)
        Set subject = new LinkedHashSet();
        subject.add("國文");
        subject.add("數學");
        subject.add("英文");
        System.out.println(subject);
        
        
    }
}
