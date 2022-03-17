package com.fls.OOPSKeyConcepts.G_Abstraction.Interfaces;

public class DeskPhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    //Interface methods
    @Override
    public void powerOn() {
        System.out.println("No action needed. Desk phone doesnt have a power button.");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " from desk phone.");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the desk phone.");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            System.out.println("Ring ring");
            return isRinging = true;
        }
            System.out.println("Its not my phone number.");
            return isRinging = false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
