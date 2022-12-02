package com.ocp.day14;

public class Coin {
    public static void main(String[] args) {
        USCurrency usCoin = new USCurrency(1);
        switch (usCoin.getValue()) {
            case 1:
                System.out.println("PENNY");
                break;
            case 5:
                System.out.println("NICKLE");
                break;
            case 10:
                System.out.println("DIME");
                break;
            case 25:
                System.out.println("QUARTER");
                break;
        }
    }
}
