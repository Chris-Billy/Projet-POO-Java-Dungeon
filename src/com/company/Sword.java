package com.company;

public class Sword {
    public static int swordDamage = 10;

    public Sword(int swordDamage) {
        this.swordDamage = swordDamage;
    }


    public static Boolean swordCritic() {
        int nb = 1 + (int)(Math.random() * ((10 - 1) + 1));
        if (nb == 1){
            return true;
        }
        else {
            return false;
        }
    }


    public static int[] swordDealDamage(){
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
