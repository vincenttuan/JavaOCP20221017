package com.ocp.day6;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 動態陣列<元素資料型別>
        ArrayList<String> names = new ArrayList<>(); // new ArrayList<String>();
        System.out.println(names); // 印出動態陣列所有元素內容
        System.out.println(names.size()); // 元素個數
        // 加入元素
        names.add("John");
        names.add("Mary");
        names.add("Jack");
        System.out.println(names);
        System.out.println(names.size());
    }
}
