package com.ocp.day15_list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo1 {
    public static void main(String[] args) {
        
        List<String> names = new LinkedList<>();
        names.add("John");
        names.add("Mary");
        names.add("John");
        names.add("Helen");
        System.out.println(names);
        // ListIterator
        ListIterator<String> listIterator = names.listIterator();
        while (listIterator.hasNext()) {
            int index = listIterator.nextIndex();
            String next = listIterator.next();
            System.out.printf("%d -> %s\n", index, next);
        }
        while (listIterator.hasPrevious()) {
            int index = listIterator.previousIndex();
            String next = listIterator.previous();
            System.out.printf("%d -> %s\n", index, next);
        }
        // 取得單筆
        System.out.println(names.get(1));
        // 修改index=1的元素
        System.out.println("修改前: " + names);
        names.set(1, "Bob");
        System.out.println("修改後: " + names);
        // 刪除 index=1 的元素
        names.remove(1);
        //刪除 Bob 的元素
        //names.remove("Bob");
        System.out.println(names);
    }
}
