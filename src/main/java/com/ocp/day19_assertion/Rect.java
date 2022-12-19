package com.ocp.day19_assertion;

// 計算矩形面積與周長 
public class Rect {
    private int weight; // 寬
    private int height; // 高

    public Rect(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }
    
    public int getArea() {
        return weight * height;
    }
    
    public int getMeter() {
        return 2 * (weight + height);
    }
    
}
