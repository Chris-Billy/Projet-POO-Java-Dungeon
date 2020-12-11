package com.company;

public class Wizzard extends Character {
    public Wizzard(String characterType, int life, int atk) {
        super(characterType, life, atk);
    }

    public boolean attack(Adventurer ennemyObject) {
        Lightning eclair = new Lightning();
        int result[] = eclair.lightningDealDamage();
        eclair = null;
        if (result[1] == 1) {
            System.out.println("l'attaque du magicien vous a paralisé");
            ennemyObject.life = ennemyObject.life - result[0];
            System.out.println("le magicien vous fait "+result[0]+" dégats");
            return true;
        } else {
            System.out.println("le magicien attaque");
            ennemyObject.life = ennemyObject.life - result[0];
            System.out.println("le magicien vous fait "+result[0]+" dégats");
            return false;
        }
    }
}
