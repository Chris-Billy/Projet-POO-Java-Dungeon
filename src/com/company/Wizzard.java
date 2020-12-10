package com.company;

public class Wizzard extends Character {
    public Wizzard(String characterType, int lifeMax, int life, int atk) {
        super(characterType, lifeMax, life, atk);
    }

    public boolean attack(Character ennemyObject) {
        int i = 1 + (int) (Math.random() * ((10 - 1) + 1));
        if (i < 2) {
            System.out.println("Vous êtes paralysé");
            ennemyObject.life = ennemyObject.life - this.atk;
            System.out.println(i);
            return true;
        } else {
            System.out.println("Attaque normale");
            System.out.println(i);
            return false;
        }
    }
}
