package com.company;

/***
 * Représente l'arme épée
 */
public class Sword {
    private int swordDamage = 10;

    /***
     * Représente le coup critique d'une épée
     * @return Vrai si c'est un critique, sinon faux si c'est une attaque normal
     */
    public Boolean swordCritic() {
        int nb = 1 + (int)(Math.random() * ((10 - 1) + 1));
        if (nb == 1){
            return true;
        }
        else {
            return false;
        }
    }

    /***
     * Correspond au nombre de dégats envoyé par l'épée
     * @return un tableau d'entier avec les dégats infigé à l'adversaire (int[])
     */
    public int[] swordDealDamage(){
        int[] tab = new int[2];
        if (swordCritic()){
            tab[0] = swordDamage * 2;
            tab[1] = 1;
            return tab;
        }
        else {
            tab[0] = swordDamage;
            tab[1] = 0;
            return tab;
        }
    }
}
