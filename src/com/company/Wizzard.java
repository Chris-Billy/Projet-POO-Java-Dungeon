package com.company;

public class Wizzard extends Character {
    public Wizzard(String characterType, int life, int atk) {
        super(characterType, life, atk);
    }

    public void attack(Adventurer ennemyObject) {
        int i = 1 + (int) (Math.random() * ((10 - 1) + 1));
        if (i < 2) {
            System.out.println("Vous êtes paralysé");
            ennemyObject.life = ennemyObject.life - this.atk;
        } else {
            System.out.println("Attaque normale");
            ennemyObject.life = ennemyObject.life - this.atk;
        }
    }
}
