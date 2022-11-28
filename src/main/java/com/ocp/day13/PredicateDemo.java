package com.ocp.day13;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        // Predicate
        /*
        public interface Predicate<T> {
            boolean test(T t);
        }
        */
        Predicate<Integer> predicate = (score) -> score >= 60;
        System.out.println(predicate.test(70) ? "Pass" : "Fail");
        System.out.println(predicate.test(40) ? "Pass" : "Fail");
        /*
        public interface IntPredicate {
            boolean test(int x);
        }
        */
        IntPredicate intPredicate = (score) -> score >= 60;
        System.out.println(intPredicate.test(70) ? "Pass" : "Fail");
        
        // BiPredicate
        /*
        public interface BiPredicate<T, U> {
            boolean test(T t, U u);
        }
        */
        BiPredicate<Integer, String> biPredicate = (x, str) -> x == str.length();
        System.out.println(biPredicate.test(10, "A123456789")); // 判斷身份證字號是否長度=10
        System.out.println(biPredicate.test(4, "S001")); // 判斷員工編號是否長度=4
        System.out.println(biPredicate.test(4, "S01")); // 判斷員工編號是否長度=4
    }
}
