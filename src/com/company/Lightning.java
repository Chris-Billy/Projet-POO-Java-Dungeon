package com.company;

public class Lightning {
    private int lihgtningDamage = 10;



    public static Boolean linghtningCritic() {
        int nb = 1 + (int) (Math.random() * ((10 - 1) + 1));
        if (nb == 1) {
            return true;
        } else {
            return false;
        }
    }


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

