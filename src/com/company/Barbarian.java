package com.company;

import java.util.Objects;

public class Barbarian extends Character{

    public Barbarian(String characterType, int life, int atk) {
        super(characterType, life, atk);
    }

    public void attack(Character ennemyObject){
        int i = 1 + (int)(Math.random() * ((3 - 1) + 1));
        if(i<2){


            System.out.println("Le barbares vous fait une attaque critique");
            ennemyObject.life = ennemyObject.life - (this.atk*2);
            System.out.println("le barbares vous fait "+this.atk*2+" dégats");

        }else {
            System.out.println("le barbare attaque");
            ennemyObject.life = ennemyObject.life - this.atk;
            System.out.println("le barbares vous fait "+this.atk+" dégats");
        }
    }
}

