package com.ocp.day17_map_groupby;

import java.util.Arrays;
import java.util.List;

public class MapGroupByDemo2 {
    public static void main(String[] args) {
        List<Fruit> fruits = Arrays.asList(
                new Fruit("apple", 10, 0.99),
                new Fruit("banana", 20, 1.99),
                new Fruit("orange", 10, 2.99),
                new Fruit("papaya", 10, 3.99),
                new Fruit("watermelon", 10, 2.99),
                new Fruit("apple", 20, 0.99),
                new Fruit("apple", 10, 0.99),
                new Fruit("papaya", 30, 3.99),
                new Fruit("apple", 10, 0.99),
                new Fruit("banana", 10, 1.99)
        );
        
    }
}
