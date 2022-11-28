package com.ocp.day13;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        // Function
        /*
            public interface Function<T, R> {
                R apply(T t);
            }
        */
        Function<String, Integer> func = (words) -> {
            return words.split(" ").length;
        };
        System.out.println(func.apply("she sell sea shell on the sea shore"));
        
        Function<String, Integer> func2 = (words) -> words.split(" ").length;
        System.out.println(func2.apply("she sell sea shell on the sea shore"));
        
    }
}
