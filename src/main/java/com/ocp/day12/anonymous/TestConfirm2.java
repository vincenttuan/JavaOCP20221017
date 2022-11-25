package com.ocp.day12.anonymous;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class TestConfirm2 {
    public static void main(String[] args) {
        int[] scores = {90, 40, 60, 30, 50, 100};
        // 及格 60, 高標 70, 低標 40
         IntPredicate pass = (x) -> x >= 60;
         IntPredicate high = (x) -> x >= 70;
         IntPredicate low = new IntPredicate() { // 一樣可以透過匿名內部類別來實現(但是不建議)
            @Override
            public boolean test(int value) {
                return value >= 40;
            }
         };
         
         Arrays.stream(scores).filter(low).forEach(System.out::println);
        
    }
}
