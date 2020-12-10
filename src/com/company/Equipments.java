package com.company;

public class Equipments {

    public static void main(String[] args) {
//        Character test = new Barbarian("Barbarian", 100, 15);
//        Character test2 = new Wizzard("Magician", 100, 25);
//        enemyWeaponAtq(test);
//        enemyWeaponAtq(test2);
//        heroWeaponAtq(test);
//        heroWeaponAtq(test2);
    }

    public Equipments() {
    }

    public static int heroWeaponAtq(Character enemy){
        if (enemy.characterType.equals("Barbarian")){
            System.out.println("Sword is effective");
            return Sword.swordDamage;
        }
        else {
            System.out.println("WaterFlask is effective ");
            return Water_flask.waterFlaskDamage;
        }
    }

    public static int enemyWeaponAtq(Character enemy){
        if (enemy.characterType.equals("Barbarian")){
            System.out.println(Axe.axeDamage);
            return Axe.axeDamage;
        }
        else {
            System.out.println(Lightning.lihgtningDamage);
            return Lightning.lihgtningDamage;
        }
    }

}
