package com.ocp.day14;

public class USCurrency {
    // PENNY: 1美分, NICKLE: 5美分, 
    // DIME: 10美分, QUARTER: 25美分
    
    private int value;
    
    public USCurrency(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
    
}
