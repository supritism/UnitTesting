package com.fls.OOPSKeyConcepts.G_Abstraction.AbstractClasses;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly(); //having this from super class as penguin has tiny wings.
        System.out.println(getName() + " - I am not very good at flying. Can we go for a swim instead!");
    }
}
