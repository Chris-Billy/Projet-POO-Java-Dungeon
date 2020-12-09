package com.company;

public class Water_flask extends Equipments{
    int stackWaterFlask;
    int waterFlaskDamage;

    public Water_flask(String[] weaponType, int stackWaterFlask, int waterFlaskDamage) {
        super(weaponType);
        this.stackWaterFlask = stackWaterFlask;
        this.waterFlaskDamage = waterFlaskDamage;
    }
}
