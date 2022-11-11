package com.ocp.day8;

import java.util.Arrays;

public class WrapperClass3 {
    public static void main(String[] args) {
        int[] nums = {100, 90, 80};
        // 利用 Arrays.stream() 計算 sum()
        int sum = Arrays.stream(nums) // IntStream
                        .sum();
        System.out.println(sum);
        Integer[] nums2 = {80, 70, 60};
        // 利用 Arrays.stream() 計算 sum()
        
    }
}
