package com.fls.OOPSKeyConcepts.G_Abstraction.AbstractClasses;

public class MainMethod {

    public static void main(String[] args) {

        Animal dog = new Dog("Frenchie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australian ringneck");
        parrot.fly();
        parrot.eat();
        parrot.breathe();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();

        Bat bat = new Bat("Black bat");
        bat.fly();
    }
}
