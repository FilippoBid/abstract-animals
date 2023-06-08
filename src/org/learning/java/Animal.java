package org.learning.java;


public abstract class Animal {


    private String name;


    public Animal(String name) {
        this.name= name;
    }

    public void sleep() {
        System.out.println("ZZZZZZZ");
    }

    public abstract void makeNoise(


    );

    public abstract void eat();
}

