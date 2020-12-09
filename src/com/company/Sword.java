package com.company;

public class Sword extends Equipments {
    int swordDamage = 10;

    public Sword(String[] weaponType, int swordDamage) {
        super(weaponType);
        this.swordDamage = swordDamage;
    }
}
