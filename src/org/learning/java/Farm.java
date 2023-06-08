package org.learning.java;

public class Farm {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Ginetto");
        animals[1] = new Bird("Ginetta");
        animals[2] = new Eagle("Pinetto");

        for (Animal animal : animals) {
            animal.makeNoise();
            animal.sleep();
            animal.eat();
        }
    }
}