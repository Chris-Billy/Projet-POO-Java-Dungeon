package com.company;

public class Axe {
    private int axeDamage = 10;



    public int damage(){
        int i = 1 + (int)(Math.random() * ((3 - 1) + 1));
        int dgt;

        if(i<2){
            dgt = 2*axeDamage;
            System.out.println("le barbare vous fait une attaque critique");
        }else{
            dgt = axeDamage;

        }




        return dgt;
    }


}
