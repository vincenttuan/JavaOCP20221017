package com.ocp.day11.decorator;

public class Subway {
    public static void main(String[] args) {
        Food food = new Bread(); // 主食 
        food = new Ham(food); // 配料
        food = new Egg(food); // 配料
        food = new Onion(food); // 配料
        food = new Lettuce(food); // 配料
        food = new Lettuce(food); // 配料
        food = new Olives(food); // 配料
        food = new Tomato(food); // 配料
        food = new Tuna(food); // 配料
        // 結帳
        System.out.printf("商品組合: %s\n商品價格: %d\n", food.getName(), food.getPrice());
    }
}
