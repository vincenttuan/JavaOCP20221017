package com.ocp.day14_set;

public class Num {
    private int cash;
    private double rate;

    public Num(int cash, double rate) {
        this.cash = cash;
        this.rate = rate;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.cash;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.rate) ^ (Double.doubleToLongBits(this.rate) >>> 32));
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
        final Num other = (Num) obj;
        if (this.cash != other.cash) {
            return false;
        }
        return Double.doubleToLongBits(this.rate) == Double.doubleToLongBits(other.rate);
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
