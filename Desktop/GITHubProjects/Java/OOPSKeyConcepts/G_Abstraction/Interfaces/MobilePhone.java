package com.fls.OOPSKeyConcepts.G_Abstraction.Interfaces;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = true;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    //Interface methods
    @Override
    public void powerOn() {
        if(isOn) {
            System.out.println("Mobile phone powered up.");
        }
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("Now ringing " + phoneNumber + " from mobile phone.");
            isOn = true;
        } else {
            System.out.println("Phone is switched off");
            isOn = false;
        }
    }

    @Override
    public void answer() {
        if(isRinging && isOn){
            System.out.println("Answering the mobile phone.");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn){
            System.out.println("Melody ring");
            return isRinging = true;
        }
        System.out.println("Its not my mobile number.");
        return isRinging = false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
