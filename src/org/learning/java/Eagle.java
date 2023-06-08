package org.learning.java;

public class Eagle extends Animal{
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

    }}

