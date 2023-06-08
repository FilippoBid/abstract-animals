package org.learning.java;

public class Eagle extends Animal implements Fly{
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("ahhhhhhh");
    }

    @Override
    public void eat() {
        System.out.println("bird");

    }
    @Override
    public void fly(String fling) {
        System.out.println(fling);

    }
}

