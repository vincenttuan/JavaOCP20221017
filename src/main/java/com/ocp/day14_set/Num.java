package com.ocp.day14_set;

public class Num {
    private int cash;
    private double rate;

    public Num(int cash, double rate) {
        this.cash = cash;
        this.rate = rate;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Num{" + "cash=" + cash + ", rate=" + rate + '}';
    }
    
    
}
