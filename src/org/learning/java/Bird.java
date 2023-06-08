package org.learning.java;

public class Bird extends Animal implements Fly{
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

    @Override
    public void fly(String fling) {
        System.out.println(fling);

    }
}
