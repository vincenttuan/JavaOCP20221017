package com.ocp.day16_map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
        Collections.sort(nums, (o1, o2) -> (o1 % 3) - (o2 % 3));
        System.out.println(nums);
    }
}
