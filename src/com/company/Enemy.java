package com.company;

public class Enemy {

    public Enemy() {
        generateRandomEnemy();
    }

    public static Character generateRandomEnemy() {
        int enemy = 1 + (int)(Math.random() * ((2 - 1) + 1));

        if (enemy == 1) {
            System.out.println("a barbarian appears");
            return new Barbarian("Barbare", 150, 150, 10);
        } else {
            System.out.println("a magician appears");
            return new Wizzard("Magicien", 150, 150, 10);
        }
    }
}
