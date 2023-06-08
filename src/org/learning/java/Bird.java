package org.learning.java;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("piu piu");

    }

    @Override
    public void eat() {
        System.out.println("worm");

    }
}
