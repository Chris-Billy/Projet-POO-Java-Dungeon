package com.company;

/***
 * Réprésente la classe salle
 */
public class Room {
    Character enemy;

    /***
     * Créé un ennemi aléatoirement
     * @return une instance d'ennemi (Object)
     */
    public Character randomEnemy() {
        int enemy = 1 + (int) (Math.random() * ((2 - 1) + 1));

        if (enemy == 1) {
            System.out.println("c'est un barbare");
            return new Barbarian("Barbare", 50, 10);

        } else {
            System.out.println("c'est un magicien");
            return new Wizzard("Magicien", 60, 10);
        }
    }
}