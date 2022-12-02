package com.ocp.day14_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo4 {
    public static void main(String[] args) {
        Set<Num> nums = new LinkedHashSet<>();
        nums.add(new Num(100, 0.5));
        nums.add(new Num(100, 0.5));
        nums.add(new Num(500, 0.2));
        nums.add(new Num(1000, 0.1));
        System.out.println(nums);
        // 計算出每個元素 cash * rate 的總和
        double sum = nums.stream()
                         .mapToDouble(num -> num.getCash() * num.getRate())
                         .sum();
        System.out.println(sum);
    }
}
