package com.fls.OOPSKeyConcepts.A_ClassesAndObjects;

public class CalculatorMain {

    public static void main(String[] args) {

        CalculatorClass calculatorObject = new CalculatorClass(); //Here - new CalculatorClass(); creates an object or instance of the “Calculator” class. And 'calculatorObject' is the reference.
        calculatorObject.setFirstNumber(100);
        calculatorObject.setSecondNumber(0);
        System.out.println("Add result is : " + calculatorObject.getAdditionResult());
        System.out.println("Multiple result is : " + calculatorObject.getMultiplicationResult());
        System.out.println( "Substract result is : " + calculatorObject.getSubtractionResult());
        System.out.println("Divide result is : " + calculatorObject.getDivisionResult());
    }
}
