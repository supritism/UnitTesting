package com.fls.OOPSKeyConcepts.C_Inheritance;

public class Animal_BaseClass {

    //All animals characteristics
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    //Constructor
    public Animal_BaseClass(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    //methods
    public void eat(){
        System.out.println("Animal.eat() called from Base class");
    }

    public void move(int speed){
        System.out.println("Animal is moving at : " + speed);
    }
}


