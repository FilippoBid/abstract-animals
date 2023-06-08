package org.learning.java;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("bau");
    }

    @Override
    public void eat() {
        System.out.println("gatti tramortiti");

    }
}
