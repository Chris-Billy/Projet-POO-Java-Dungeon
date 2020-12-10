package com.company;

public class Room {

    protected int numberRoom;

    public static void main(String[] args) {
        randomEnemy();
    }

    public static Character randomEnemy() {

        int enemy = 1 + (int)(Math.random() * ((2 - 1) + 1));

        if (enemy == 1) {
            System.out.println("je suis un barbare");
            return new Barbarian("Barbare", 150, 150, 10);

        }
        else {
            System.out.println("je suis un magicien");
            return new Wizzard("Magicien", 150, 150, 10);
        }
    }
}
