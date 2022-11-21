package com.ocp.day11.decorator;

public class Bread extends AFood {
    
    public Bread() {
        name = "麵包";
        price = 40;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
    
}
