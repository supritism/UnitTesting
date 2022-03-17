package com.fls.OOPSKeyConcepts.G_Abstraction.Interfaces;

public interface ITelephone {
    //declaring access modifiers for interface methods here is actually useless as we will be doing that the respective classes.
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}

/*
Notes_NamingConventions :
- An interface is a group of related methods with empty bodies. The actual code for the interface methods will be in
the class that implements it.
- To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the
'implements' keyword (instead of 'extends').
- When naming an Interface, we start with 'I' followed by the interface name. But now a days intelliJ
clearly shows us what is Interface and what is Class so we dont have to add 'I' before the name.
 */