package com.company;

/***
 * Classe représentant un Barbare
 */
public class Barbarian extends Character{

    /***
     * Constructeur d'un Barbare
     * @param characterType Type du personnage (String)
     * @param life point de vie du personnage (Int)
     * @param atk point d'attaque du personnage (Int)
     */
    public Barbarian(String characterType, int life, int atk) {
        super(characterType, life, atk);
    }

    /***
     * Permet au Barbare d'attaquer
     * @param ennemyObject l'adversaire sur qui lancer l'attaque (Object)
     */
    public void attack(Character ennemyObject){
        Axe hache = new Axe();
        System.out.println("Le barbares vous attaque");
        int dgt = hache.damage();
        ennemyObject.life = ennemyObject.life - (dgt);
        System.out.println("le barbares vous fait "+dgt+" dégats");
        hache = null;

    }
}

