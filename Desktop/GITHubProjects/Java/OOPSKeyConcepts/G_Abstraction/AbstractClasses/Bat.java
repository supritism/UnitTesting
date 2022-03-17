package com.fls.OOPSKeyConcepts.G_Abstraction.AbstractClasses;

public class Bat extends Animal implements CanFly {
    public Bat(String name) {
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

    @Override
    public void fly() {
            System.out.println(getName() + " is a rare animal that can fly!");
        }
}
