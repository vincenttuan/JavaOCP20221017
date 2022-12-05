package com.ocp.day15_list;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        names.push("A");
        names.push("B");
        names.push("C");
        System.out.println(names);
        while (!names.isEmpty()) {            
            String name = names.pop();
            System.out.println(name);
            System.out.println(names);
        }
        System.out.println(names);
    }
}
