package com.company;

public class Wizzard extends Character {
    public Wizzard(String characterType, int life, int atk) {
        super(characterType, life, atk);
    }

    public boolean attack(Adventurer ennemyObject) {
        int i = 1 + (int) (Math.random() * ((10 - 1) + 1));

        if (i < 2) {
            System.out.println("l'attaque du magicien vous a paralisé");
            ennemyObject.life = ennemyObject.life - this.atk;
            System.out.println("le magicien vous fait "+this.atk+" dégats");
            return true;
        } else {
            System.out.println("le magicien attaque");
            ennemyObject.life = ennemyObject.life - this.atk;
            System.out.println("le magicien vous fait "+this.atk+" dégats");
            return false;
        }
    }
}
