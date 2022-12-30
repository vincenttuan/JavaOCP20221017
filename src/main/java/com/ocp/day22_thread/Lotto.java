package com.ocp.day22_thread;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;

public class Lotto implements Callable<Set<Integer>>{
    private Random random = new Random();
    @Override
    public Set<Integer> call() throws Exception {
        // 今彩539(1~39)隨機取5個不重複的數字
        Set<Integer> nums = new LinkedHashSet<>();
        while (nums.size() < 5) {            
            int n = random.nextInt(39) + 1;
            nums.add(n);
        }
        return nums;
    }
    
}
