package com.ocp.day13;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        // Consumer
        Consumer<String> consumer = (String x) -> System.out.println("Hello " + x);
        consumer.accept("John");
    }
}
