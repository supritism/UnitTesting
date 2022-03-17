package com.fls.OOPSKeyConcepts.E_Encapsulation;

//This class example is following Encapsulation.
public class Player_withEncapsulation {

    // All methods are private so encapsulated
    private String name;
    private int health = 100; //Default value is 100
    private String weapon;

    public Player_withEncapsulation(String name, int health, String weapon) {
        this.name = name;
        if(health >0 && health <=100) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        health -= damage;
        if(health <= 0){
            System.out.println("Player knocked out");
        }
    }

    public int getHealth() {
        return health;
    }
}
