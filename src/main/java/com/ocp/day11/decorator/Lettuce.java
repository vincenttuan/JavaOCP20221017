package com.ocp.day11.decorator;

public class Lettuce extends SideDish {
    
    public Lettuce(Food food) {
        super(food);
        name = "生菜";
        price = 15;
    }
    
}
