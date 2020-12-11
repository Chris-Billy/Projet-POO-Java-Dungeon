package com.company;

public class Main {

    public static void main(String[] args) {
        Barbarian newBarbare = new Barbarian("oui", 40, 40);
        Wizzard newWizzard = new Wizzard("oui2", 40, 40);

        Object ennemy = Room.randomEnemy();
        System.out.println(ennemy);
    }

}
