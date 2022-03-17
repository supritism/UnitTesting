package com.fls.OOPSKeyConcepts.G_Abstraction.AbstractClasses;

public abstract class Animal {
    private String name;

    //Constructor
    public Animal(String name) {
        this.name = name;
    }

    //Other additional methods
    public abstract void eat();
    public abstract void breathe();

    //getter
    public String getName() {
        return name;
    }
}

