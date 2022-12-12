package com.ocp.day17_map_groupby;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

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
        
        Map<String, Long> result = fruits.stream().collect(
            Collectors.groupingBy(Fruit::getName, Collectors.counting())
        );
        System.out.println(result);
        
        Map<String, Integer> sum = fruits.stream().collect(
            Collectors.groupingBy(Fruit::getName, Collectors.summingInt(Fruit::getQty))
        );
        System.out.println(sum);
        
        // group by price
        /*
        {
            1.99=[Fruit{name=banana, qty=20, price=1.99}, Fruit{name=banana, qty=10, price=1.99}], 
            0.99=[Fruit{name=apple, qty=10, price=0.99}, Fruit{name=apple, qty=20, price=0.99}, Fruit{name=apple, qty=10, price=0.99}, Fruit{name=apple, qty=10, price=0.99}], 
            2.99=[Fruit{name=orange, qty=10, price=2.99}, Fruit{name=watermelon, qty=10, price=2.99}], 
            3.99=[Fruit{name=papaya, qty=10, price=3.99}, Fruit{name=papaya, qty=30, price=3.99}]
        }
        */
        Map<Double, List<Fruit>> groupByPrice = fruits.stream().collect(
            Collectors.groupingBy(Fruit::getPrice)
        );
        System.out.println(groupByPrice);
        
        // group by price
        /*
        list
        {
            1.99=banana, banana, 
            0.99=apple, apple, apple, 
            2.99=orange, watermelon,
            3.99=papaya, papaya
        }
        透過 toSet() 剔除重複資料
        {
            1.99=[banana], 
            0.99=[apple], 
            2.99=[orange, watermelon], 
            3.99=[papaya]
        }
        */
        
        Map<Double, Set<String>> groupByPrice2 = fruits.stream().collect(
            Collectors.groupingBy(Fruit::getPrice, Collectors.mapping(Fruit::getName, Collectors.toSet()))
        );
        System.out.println(groupByPrice2);
    }
}
