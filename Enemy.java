package com.company;

public class Enemy extends Person {
    //Private variables
    String Name;

    public Enemy(String Name){
        super("","yes",100);
        this.Name = Name;
        System.out.println("Enemy: "+ Name);
    }

}
