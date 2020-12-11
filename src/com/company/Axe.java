package com.company;

/***
 * Classe représentant une Hache
 */
public class Axe {
    /***
     * Point de dommage de la hache
     */
    private int axeDamage = 10;

    /***
     * Infliger des dommages avec la hache
     * @return le nombre de dégats infligé par la hache (Int)
     */
    public int damage() {
        int i = 1 + (int)(Math.random() * ((3 - 1) + 1));
        int dgt;

        if (i<2) {
            dgt = 2*axeDamage;
            System.out.println("le barbare vous fait une attaque critique");
        } else {
            dgt = axeDamage;
        }
        return dgt;
    }
}
