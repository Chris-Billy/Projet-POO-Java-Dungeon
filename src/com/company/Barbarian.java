package com.company;

import java.util.Objects;

public class Barbarian extends Character{

    public Barbarian(String characterType, int lifeMax, int life, int atk) {
        super(characterType, lifeMax, life, atk);
    }

    public void attack(Character ennemyObject){
        int i = 1 + (int)(Math.random() * ((3 - 1) + 1));
        if(i<2){
            System.out.println("attaque critique");
        }else {
            System.out.println("Attaque normale");
        }


    }
}

