package com.company;

public class CaptainAmerica extends User{
    public CaptainAmerica(){
        super("Captain America");
        if(health > 0){
        System.out.println(Alive);
        }
        else{
            System.out.println("Dead");
        }
    }
}
