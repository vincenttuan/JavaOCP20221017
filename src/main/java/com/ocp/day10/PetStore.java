package com.ocp.day10;

import java.util.ArrayList;

public class PetStore {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.eat();
        dog.play();
        cat.eat();
        cat.play();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        System.out.println(animals);
    }
}
