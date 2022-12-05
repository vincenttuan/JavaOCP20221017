package com.ocp.day15_list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> names = new LinkedList<>();
        names.offer("A");
        names.offer("B");
        names.offer("C");
        System.out.println(names);
        while (!names.isEmpty()) {            
            String name = names.poll();
            System.out.println(name);
            System.out.println(names);
        }
        System.out.println(names);
    }
}
