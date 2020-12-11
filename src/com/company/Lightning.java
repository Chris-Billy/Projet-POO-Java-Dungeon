package com.company;

/***
 * Représente une attaque éclair
 */
public class Lightning {
    private int lihgtningDamage = 10;

    /***
     * Représente le coup critique d'une attaque éclair
     * @return vrai si c'est un Critique, sinon Faux
     */
    public static Boolean linghtningCritic() {
        int nb = 1 + (int) (Math.random() * ((10 - 1) + 1));
        if (nb == 1) {
            return true;
        } else {
            return false;
        }
    }

    /***
     * Correspond au nombre de dégats envoyé par l'attaque éclair
     * @return un tableau d'entier avec les dégats infigé à l'adversaire (int[])
     */
    public int[] lightningDealDamage() {
        int[] tab = new int[2];
        if (linghtningCritic()) {
            tab[0] = lihgtningDamage * 2;
            tab[1] = 1;
            return tab;
        } else {
            tab[0] = lihgtningDamage;
            tab[1] = 0;
            return tab;
        }
    }
}

