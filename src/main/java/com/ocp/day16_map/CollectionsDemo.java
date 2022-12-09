package com.ocp.day16_map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class CollectionsDemo {
    public static void main(String[] args) {
        
        List<Integer> nums = new ArrayList<>();
        nums.add(14); // %3 = 2
        nums.add(4);  // %3 = 1
        nums.add(9);  // %3 = 0
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);
        // 根據 %3 的值來排序
        Collections.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1 % 3) - (o2 % 3);
            }
        });
        System.out.println(nums);
        // 根據 %3 的值來排序(使用 Lambda)
        Comparator<Integer> comparator1 = (o1, o2) -> (o1 % 3) - (o2 % 3);
        Comparator<Integer> comparator2 = (o1, o2) -> o2 - o1;
        Collections.sort(nums, comparator1);
        System.out.println(nums);
        // 利用 Consume
        BiConsumer<List<Integer>, Comparator<Integer>> consumer1 = (list, comp) -> Collections.sort(list, comp);
        consumer1.accept(nums, comparator2);
        System.out.println(nums);
        
        // 不可修改集合 (不可以對集合進行 add(), remove(), set())
        nums = Collections.unmodifiableList(nums);
        //nums.add(50); 
        //nums.remove(9);
        //nums.set(0, 99);
    }
}
