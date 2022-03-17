package com.fls.OOPSKeyConcepts.G_Abstraction.AbstractClasses;

public abstract class Bird extends Animal implements CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " - Breath in, Breath out and repeat!");
    }

    //** Remove below as abstract method and put that in an Interface.**
     // public abstract void fly(); //No body as abstract methods have no implementation.

    @Override
    public void fly(){
        System.out.println(getName() + " is flapping it's wings");
    }
}
