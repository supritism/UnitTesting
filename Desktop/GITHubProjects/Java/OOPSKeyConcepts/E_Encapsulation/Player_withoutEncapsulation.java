package com.fls.OOPSKeyConcepts.E_Encapsulation;

//This class example is not following Encapsulation.
public class Player_withoutEncapsulation {

    // All methods are public so no encapsulation
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        health -= damage;
        if(health <= 0){
            System.out.println("Player knocked out");
        }
    }

    public int healthRemaining() {
        return health;
    }
}
