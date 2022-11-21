package com.ocp.day11_1;

public class Pen {
    private String color;
    private int price;
    public Pen(String color, int price) {
        this.color = color;
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Pen: " + color + ", " + price;
    }
}
