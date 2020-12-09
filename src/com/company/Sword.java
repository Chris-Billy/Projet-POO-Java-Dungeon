package com.company;

public class Sword extends Equipments {
    int swordDamage;

    public Sword(String[] weaponType, int swordDamage) {
        super(weaponType);
        this.swordDamage = swordDamage;
    }
}
