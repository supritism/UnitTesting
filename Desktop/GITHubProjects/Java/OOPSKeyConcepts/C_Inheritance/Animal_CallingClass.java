package com.fls.OOPSKeyConcepts.C_Inheritance;

import com.udemy.section6_OOPS_Part1.Inheritance.AnimalType_Fish;

public class Animal_CallingClass {

    public static void main(String[] args) {
        Animal_BaseClass animal = new Animal_BaseClass("Animal", 1, 1, 5, 5);
        AnimalType_Dog dog = new AnimalType_Dog("Pub", 5, 5, 2, 4, 1, 34, "Silky");
        AnimalType_Fish fish = new AnimalType_Fish("GoldFish", 3, 3, 2, 2, 5);
        dog.eat(); // eat() method was defined in 'BaseClass_Animal' class but as 'AnimalType_Dog' extends to it, we can use it in latter.
        dog.walk();
        dog.run();
        System.out.println(dog.getBrain()); // this will give o/p : 1
    }
}
