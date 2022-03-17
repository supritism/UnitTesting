package com.fls.OOPSKeyConcepts.E_Encapsulation;

public class MainCallingclass {

    public static void main(String[] args) {

        //Creating object for class without encapsulation
        Player_withoutEncapsulation player1 = new Player_withoutEncapsulation();
        player1.name = "Tim";
        player1.health = 20;
        player1.weapon = "Sword";
        player1.loseHealth(10);
        System.out.println("Remaining health is : " + player1.healthRemaining());

        player1.health = 200; //Overriding health value here. What if user should never be able to change player's health value outside the class like this.
        player1.loseHealth(11);
        System.out.println("Remaining health is : " + player1.healthRemaining());

        //Creating object for class with encapsulation
        Player_withEncapsulation player2 = new Player_withEncapsulation("Tim", 50, "Knife");
        System.out.println("Player2's health is : " + player2.getHealth());
        player2.loseHealth(30);
        System.out.println("Player2's health is : " + player2.getHealth());

    }
}
