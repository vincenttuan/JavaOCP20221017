package com.ocp.day11.decorator;

public class Egg extends SideDish {
    
    public Egg(Food food) {
        super(food);
        name = "雞蛋";
        price = 18;
    }
    
}
