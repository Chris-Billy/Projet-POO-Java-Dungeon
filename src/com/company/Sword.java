package com.company;

public class Sword {
    private int swordDamage = 10;




    public Boolean swordCritic() {
        int nb = 1 + (int)(Math.random() * ((10 - 1) + 1));
        if (nb == 1){
            return true;
        }
        else {
            return false;
        }
    }


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
