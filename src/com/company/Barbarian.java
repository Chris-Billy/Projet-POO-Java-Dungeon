package com.company;

import java.util.Objects;

public class Barbarian extends Character{

    public Barbarian(String characterType, int life, int atk) {
        super(characterType, life, atk);
    }

    public void attack(Character ennemyObject){
        Axe hache = new Axe();
        System.out.println("Le barbares vous attaque");
        int dgt = hache.damage();
        ennemyObject.life = ennemyObject.life - (dgt);
        System.out.println("le barbares vous fait "+dgt+" dégats");
        hache = null;

    }
}

