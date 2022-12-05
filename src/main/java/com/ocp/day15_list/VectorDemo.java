package com.ocp.day15_list;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(641, 10);
        System.out.println("capacity(總共空間): " + v.capacity());
        System.out.println("size(已使用空間): " + v.size());
        
        for(int i=1;i<=641;i++) {
            v.add(i);
        }
        v.add(999); // <-- 意外增加
        
        System.out.println("capacity(總共空間): " + v.capacity());
        System.out.println("size(已使用空間): " + v.size());
    }
}
