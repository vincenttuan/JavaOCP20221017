package com.ocp.day9;

import java.util.Random;

public class Dao {
    private int number;
    public Dao() {
        number = new Random().nextInt(100_0000);
    }

    @Override
    public String toString() {
        return "Dao{" + "number=" + number + '}';
    }
}
