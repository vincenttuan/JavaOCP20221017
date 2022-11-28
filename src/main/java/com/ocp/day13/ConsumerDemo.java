package com.ocp.day13;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        // Consumer
        Consumer<String> consumer = (String x) -> System.out.println("Hello " + x);
        consumer.accept("John");
        // BiConsumer
        BiConsumer<String, Integer> biConsumer = (name, age) -> System.out.println(name + " 的年齡是 " + age);
        biConsumer.accept("John", 18);
        // Consumer 多參數
        Consumer<Integer[]> consumer2 = (values) -> {
            int sum = Arrays.stream(values).mapToInt(Integer::intValue).sum();
            System.out.println(sum);
        };
        consumer2.accept(new Integer[]{100, 90, 80});
    }
}
