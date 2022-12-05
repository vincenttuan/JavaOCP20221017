package com.ocp.day15_list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("John");
        names.add(null);
        names.add("Mary");
        int size = names.size();
        /*
        // 利用 for-loop 刪除元素容易導致失敗, 因為集合會因為元素被刪除長度會變動
        for(int i=0;i<size;i++) {
            // 將 null 的元素刪除
            System.out.println(names.get(i));
            if(names.get(i) == null) {
                names.remove(i);
            }
        }
        */
        ListIterator<String> listIterator = names.listIterator();
        while (listIterator.hasNext()) {
            int index = listIterator.nextIndex();
            String next = listIterator.next();
            System.out.printf("%d -> %s\n", index, next);
            if(next == null) {
                listIterator.remove();
            }
        }
        System.out.println(names);
    }
}
