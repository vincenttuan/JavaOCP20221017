package com.ocp.day24_thread;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class SumTaskDemo {
    public static void main(String[] args) {
        int len = 10;
        int[] array = new int[len];
        // 期望結果
        int expectedSum = 0;
        for(int i=0;i<array.length;i++) {
            array[i] = i + 1;
            expectedSum += array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.printf("期望結果: %d\n", expectedSum);
        System.out.println("--------------------------------");
        // forkjoin:
        ForkJoinTask<Integer> task = new SumTask(array, 0, array.length);
        int result = ForkJoinPool.commonPool().invoke(task); // 
        System.out.printf("執行結果(forkjoin): %d\n", result);
    }
}
