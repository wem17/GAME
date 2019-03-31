package com.company;

public class Person{
    //Data Members
    int health;
    String Alive;
    String Name;


    public Person(String Name,String Alive, int health) {
        this.Alive = Alive;
        this.health = health;
        this.Name = Name;
        System.out.println("Is Person Alive: " +Alive);
        System.out.println("Person health is: " +health);
        System.out.println("Name of Person is"+Name);

    }

    }
