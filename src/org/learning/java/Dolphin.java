package org.learning.java;

public class Dolphin extends Animal {
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("hi hih ii ");

    }

    @Override
    public void eat() {
        System.out.println("fish");

    }
}

