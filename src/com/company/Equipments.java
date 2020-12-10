package com.company;

public class Equipments {

    public static void main(String[] args) {
        System.out.println(Axe.axeDamage);
    }

    public Equipments() {
    }
    /* L'appel vers la class Axe et toutes autre marche mais il faut ajouter une comparaison de string pour le faire automatiquement*/
/*
    public static int heroWeapon(Enemy String){
        if ("Barbarian".equals(Enemy)){
            System.out.println(Axe.axeDamage);
            return Axe.axeDamage;
        }
        else {
            System.out.println(Lightning.lihgtningDamage);
            return Lightning.lihgtningDamage;
        }
    }

    public static int enemyWeapon(){
        if (Enemy == ("Barbarian")){
            System.out.println(Axe.axeDamage);
            return Axe.axeDamage;
        }
        else {
            System.out.println(Lightning.lihgtningDamage);
            return Lightning.lihgtningDamage;
        }
    }
*/
}
