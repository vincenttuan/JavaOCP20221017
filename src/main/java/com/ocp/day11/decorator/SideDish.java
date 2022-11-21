package com.ocp.day11.decorator;

public class SideDish extends AFood {
    protected Food food;
    
    public SideDish(Food food) {
        this.food = food;
    }
    
    @Override
    public String getName() {
        return name + " + " + food.getName();
    }

    @Override
    public int getPrice() {
        return price + food.getPrice();
    }
    
    @Override
    public String getNameAndPrice() {
        return name + "(" + price + ")" + " + " + ((AFood)food).getNameAndPrice();
    }
    
}
