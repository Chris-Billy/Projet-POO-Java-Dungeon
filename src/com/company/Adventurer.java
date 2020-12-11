package com.company;

/***
 * Classe représentant un Aventurier
 */
public class Adventurer extends Character {
    /***
     * Constructeur de l'aventurier
     * @param characterType Type du personnage (String)
     * @param life point de vie du personnage (Int)
     * @param atk point d'attaque du personnage (Object)
     */
    public Adventurer(String characterType, int life, int atk) {
        super(characterType, life, atk);
    }

    /***
     * Réprésente le nombre de water flask qui a été lancé par l'aventurier durant un combat
     */
    public int nbWaterFlask = 0;

    /***
     * Attaquer un ennemi à l'épée avec possibilité de l'étourdir
     * @param ennemyObject l'ennemi ciblé par l'attaque (Object)
     * @return Vrai si l'ennemi est étourdit, sinon Faux pour attaquer normalement
     */
    public boolean attackSword(Character ennemyObject) {
        Sword epee = new Sword();
        int[] result = epee.swordDealDamage();
        epee = null;
        if (result[1] == 1) {
            System.out.println("vous avez toucher le barbare a la tete il est étourdit, profitez-en!");
            int damage = result[0];
            ennemyObject.life -= damage;
            System.out.println("vous infligez au barbare: " + damage + " point de dégats");
            System.out.println("il reste au barbare: " + ennemyObject.life + " point de vie");
            return true;
        } else {
            int damage = result[0];
            ennemyObject.life -= damage;
            System.out.println("vous infligez au barbare: " + damage + " point de dégats");
            System.out.println("il reste au barbare: " + ennemyObject.life + " point de vie");
            return false;
        }
    }

    /***
     * Attaquer un ennemi à la flasque deau
     * @param ennemyObject l'ennemi ciblé par l'attaque (Object)
     */
    public void attackFlask(Character ennemyObject) {

        Water_flask damageWater = new Water_flask();
        int damage = damageWater.flaskDamage(nbWaterFlask);
        nbWaterFlask++;
        ennemyObject.life -= damage;
        System.out.println("vous infligez au magicien: " + damage + " point de vie");
        System.out.println("il reste au magicien: " + ennemyObject.life + " point de vie");
    }
}
