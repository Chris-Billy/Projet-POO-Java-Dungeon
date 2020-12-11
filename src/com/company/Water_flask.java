package com.company;

/***
 * Représente la flaque d'eau
 */
public class Water_flask {
    private int waterFlaskDamage = 10;
    public static int nbWaterFlask = 0;

    /***
     * Constructeur de la flaque d'eau
     */
    public Water_flask() {
    }

    /***
     * Infliger des dommages avec la flaque d'eau
     * @param nb le nombre de flaque lancé (Int)
     * @return les dégats infligé par la flaque d'eau (Int)
     */
    public int flaskDamage(int nb) {
        if (nb == 0){
            return waterFlaskDamage;
        }
        else {
            return (waterFlaskDamage + (2 * nb));
        }
    }
}
