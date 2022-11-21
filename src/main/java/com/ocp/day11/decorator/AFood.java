package com.ocp.day11.decorator;

public abstract class AFood extends Food {
    public String getNameAndPrice() {
        return name + "(" + price + ")";
    }
}
