package com.company;

/***
 * Représente la classe Magicien
 */
public class Wizzard extends Character {
    /***
     * Constructeur d'un magicien
     * @param characterType Type du personnage (String)
     * @param life point de vie du personnage (Int)
     * @param atk point d'attaque du personnage (Object)
     */
    public Wizzard(String characterType, int life, int atk) {
        super(characterType, life, atk);
    }

    /***
     * Permet au Barbare d'attaquer
     * @param ennemyObject l'adversaire sur qui lancer l'attaque (Object)
     * @return Vrai si le magicien paralyse l'ennemi, faux si c'est une attaque normal
     */
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
