package com.ocp.day14;

public class PositionDemo {
    
    public static void main(String[] args) {
        Position position = Position.總經理;
        job(position);
    }
    
    public static void job(Position position) {
        switch (position) {
            case 經理:
                System.out.println("管理員工");
                break;
            case 總經理:
                System.out.println("管理公司");
                break;    
        }
    }
    
}
