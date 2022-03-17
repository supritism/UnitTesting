package com.fls.OOPSKeyConcepts.C_Inheritance;

//Inheritance : To extend a Base class to another class use 'extends' in the later class.
public class AnimalType_Dog extends Animal_BaseClass {

    //Characters specific to Animal type - Dog
    private int eyes;
    private int legs;
    private  int tail;
    private int teeth;
    private String coat;

    /* Constructor - automatically picks parameters from the Inherited class.
    'super' keyword indicates these are coming from the Base class or extended class.
    */

    public AnimalType_Dog(String name, int size, int weight, int eyes,
                          int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); //By setting 'brain' and 'body' as 1, we are defaulting the parameter values and not force user to enter a value for these.
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    //Method specific to Dog class
    private void chew(){
        System.out.println("Dogs.chew() called");
    }

    //Override methods - Can auto generate via Code >> Generate
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    @Override
    public void move(int speed){
        System.out.println("Dog is moving at speed: " + speed);
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        move(5); // This will call the overridden move() method.If not found,it will go search in Base method and use it.
    }

    public void run(){
        System.out.println("Dog.run() called");
        super.move(10); // This will call move from base animal class only.
    }
}
