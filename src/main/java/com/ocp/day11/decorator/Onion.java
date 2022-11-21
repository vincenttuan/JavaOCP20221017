package com.ocp.day11.decorator;

public class Onion extends SideDish {
    
    public Onion(Food food) {
        super(food);
        name = "洋蔥";
        price = 12;
    }
    
}
