package com.company;

public class Water_flask {
    public static int waterFlaskDamage = 10;
    public static int nbWaterFlask = 0;

    public Water_flask() {
    }

    public static int flaskDamage(int nb) {
        if (nb == 0){
            return waterFlaskDamage;
        }
        else {
            return (waterFlaskDamage + (2 * nb));
        }
    }
}
