package com.fls.OOPSKeyConcepts.A_ClassesAndObjects;

public class Car {

    // See class level variables below . Can be used anywhere with any methods within this class.
    // We have used 'private' for all the variables to enable Encapsulation i.e only access these variables within this class.
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    //setter
    public void setModel(String model) {
        String validModel = model.toUpperCase();

        if (validModel.contains("VW") || validModel.contains("LEXUS")) {
            this.model = model; // 'this' keyword refers to local variable.
        } else {
            this.model = "Unknown";
        }
    }

    //getter
    public String getModel() {
        return this.model;
    }

}
