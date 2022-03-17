package com.fls.OOPSKeyConcepts.A_ClassesAndObjects;

public class CarMain {

    public static void main(String[] args) {

        Car carObject = new Car(); //Here - new Car(); creates an object or instance of the “car” class. And 'carObject' is the reference.
        carObject.setModel("VW Golf R");
        System.out.println(carObject.getModel());
    }
}
