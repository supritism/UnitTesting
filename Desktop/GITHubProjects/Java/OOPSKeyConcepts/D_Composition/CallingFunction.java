package com.fls.OOPSKeyConcepts.D_Composition;

public class CallingFunction {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(5, 10, 3);
        Case theCase = new Case("200B", "Dell","240", dimensions );

        Monitor theMonitor = new Monitor("27 inch beast", "Aser",27, new Resolution(5, 10));
        Motherboard theMotherboard = new Motherboard("BJ-220", "Asus", 4, 5, "v2.44");

        //Composition - Putting case, monitor and motherboard together to build a PC
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.getTheMonitor().drawPixelAt(5, 6, "red");
        thePC.getTheMotherboard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();
    }
}
