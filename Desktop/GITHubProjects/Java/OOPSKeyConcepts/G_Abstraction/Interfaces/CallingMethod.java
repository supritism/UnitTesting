package com.fls.OOPSKeyConcepts.G_Abstraction.Interfaces;

public class CallingMethod {

    public static void main(String[] args) {
        ITelephone sanaPhone;

        System.out.println("*********************");
        sanaPhone = new DeskPhone(2066789876);
        sanaPhone.powerOn();
        sanaPhone.callPhone(2066789876);
        sanaPhone.answer();
        sanaPhone.dial(2066789800);
        sanaPhone.isRinging();

        System.out.println("*********************");
        sanaPhone = new MobilePhone(94371187);
        sanaPhone.powerOn();
        sanaPhone.callPhone(2066789876);
        sanaPhone.answer();
        sanaPhone.dial(2066789800);
        sanaPhone.isRinging();

        /* Note:
        - Just cause we have initially declared sanaPhone as a ITelephone interface type so we can latter on reference it to object of DeskPhone or MobilePhone.
        - But if we had declared it as a 'DeskPhone' or 'MobilePhone' we wouldn't have been able to reuse the variable reference.
        */

    }

}
