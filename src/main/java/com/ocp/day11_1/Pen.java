package com.ocp.day11_1;

import java.util.Objects;

public class Pen {
    private String color;
    private int price;
    public Pen(String color, int price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.color);
        hash = 17 * hash + this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pen other = (Pen) obj;
        if (this.price != other.price) {
            return false;
        }
        return Objects.equals(this.color, other.color);
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
