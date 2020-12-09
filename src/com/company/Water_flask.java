package com.company;

public class Water_flask extends Equipments{
    int stackWaterFlask;
    int maxStack = 5;
    int waterFlaskDamage = 2;

    public Water_flask(String[] weaponType, int stackWaterFlask, int waterFlaskDamage) {
        super(weaponType);
        this.stackWaterFlask = stackWaterFlask;
        this.waterFlaskDamage = waterFlaskDamage;
    }
}
