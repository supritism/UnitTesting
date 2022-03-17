package com.fls.OOPSKeyConcepts.A_ClassesAndObjects;

import lombok.Data;

@Data
public class CalculatorClass {

    private double firstNumber;
    private double secondNumber;

    // Method to add
    public double getAdditionResult(){
        return (getFirstNumber() + getSecondNumber());
    }

    // Method to substract
    public double getSubtractionResult(){
        return (getFirstNumber() - getSecondNumber());
    }

    // Method to multiply
    public double getMultiplicationResult(){
        return (getFirstNumber() * getSecondNumber());
    }

    // Method to divide
    public double getDivisionResult() {
        if (getSecondNumber() != 0.0) {
            return (getFirstNumber() / getSecondNumber());
        }
        return 0.0;
    }
}
