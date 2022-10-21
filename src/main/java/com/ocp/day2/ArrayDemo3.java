package com.ocp.day2;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] scores = {100, 92, 85, 73, 68};
        // 計算個數, 總和, 平均, 最大值, 最小值
        System.out.printf("個數: %d\n", scores.length);
        System.out.printf("總和: %d\n", getSum(scores));
        System.out.printf("平均: %.1f\n", getAvg(scores));
        
    }
    // 設計一個可以針對一維陣列計算出總和的方法
    public static int getSum(int[] array) {
        int sum = 0;
        for(int value : array) {
            sum += value; // 相當於 sum = sum + value; 累加
        }
        return sum;
    }
    // 設計一個可以針對一維陣列計算出平均的方法
    public static double getAvg(int[] array) {
        int sum = getSum(array);
        double avg = (double)sum / array.length;
        return avg;
    }
    // 設計一個可以針對一維陣列計算出最大值的方法
    public static int getMax(int[] array) {
        int max = 0; // 預設最大值 = 0
        for(int value : array) {
            if(value > max) {
                max = value;
            }
        }
        return max;
    }
    // 設計一個可以針對一維陣列計算出最小值的方法
    public static int getMin(int[] array) {
        int min = 100; // 預設最小值 = 100
        for(int value : array) {
            if(value < min) {
                min = value;
            }
        }
        return min;
    }
}
