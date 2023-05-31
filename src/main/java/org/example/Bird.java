package org.example;

public abstract class Bird {
    public enum BeakType {MEAT_EATER, SEED_EATER, FISH_EATER};
    float weight;
    String colour;

    String name;
    String size;
    BeakType beakType;

    public void eat() {
        System.out.println(name +" is eating");
    }

    public void makeSound() {
        System.out.println(name +" is making sound");
    }


}


