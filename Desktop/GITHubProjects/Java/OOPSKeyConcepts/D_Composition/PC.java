package com.fls.OOPSKeyConcepts.D_Composition;

// The PC class 'has a' Case, Monitor, Motherboard i.e it is comprised of these things and that is called composition
public class PC {

    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherboard;

    public PC(Case theCase, Monitor theMonitor, Motherboard themotherboard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherboard = themotherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getTheMonitor() {
        return theMonitor;
    }

    public Motherboard getTheMotherboard() {
        return theMotherboard;
    }


}
