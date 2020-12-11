package com.company;

public class Adventurer extends Character {
    public Adventurer(String characterType, int life, int atk) {
        super(characterType, life, atk);
    }

    public int nbWaterFlask = 0;

    public boolean attackSword(Character ennemyObject) {

        int[] result = Sword.swordDealDamage();
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

    public void attackFlask(Character ennemyObject) {

        //Water_flask damageWater = new Water_flask();
        int damage = Water_flask.flaskDamage(nbWaterFlask);
        nbWaterFlask++;
        ennemyObject.life -= damage;
        System.out.println("vous infligez au magicien: " + damage + " point de vie");
        System.out.println("il reste au magicien: " + ennemyObject.life + " point de vie");
    }
}
