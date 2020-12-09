package com.company;

public class Main {

    public static void main(String[] args) {
        Barbarian newBarbare = new Barbarian("oui", 40, 40, 40);
        Barbarian newBarbare2 = new Barbarian("oui2", 40, 40, 40);
        newBarbare.attack(newBarbare2);
    }
}
