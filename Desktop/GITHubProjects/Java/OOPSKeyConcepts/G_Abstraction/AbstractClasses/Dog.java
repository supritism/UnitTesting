package com.fls.OOPSKeyConcepts.G_Abstraction.AbstractClasses;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " - Breath in, Breath out and repeat!");
    }
}
