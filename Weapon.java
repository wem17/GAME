package com.company;

public class Weapon extends Item{

     int damage;

    public Weapon(String object, int damage){
         super("Item for Combat: ", "Color: "," Size of weapon: " );
         this.damage = damage;

    }

}
