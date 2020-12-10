package com.company;

//    Contient un ennemi généré aléatoirement
public class Room {
    Character enemy;


    protected int numberRoom;


    public static Character randomEnemy() {

        int enemy = 1 + (int) (Math.random() * ((2 - 1) + 1));

        if (enemy == 1) {
            System.out.println("c'est un barbare");
            return new Barbarian("Barbare", 50, 60, 10);

        } else {
            System.out.println("c'est un magicien");
            return new Wizzard("Magicien", 60, 60, 10);
        }


    }
}