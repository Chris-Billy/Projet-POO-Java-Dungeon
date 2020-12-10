package com.company;

import java.sql.SQLOutput;

public class Character {

    protected String characterType;
    protected int lifeMax;
    int life;
    protected int atk;

    public Character(String characterType, int lifeMax, int life, int atk) {
        this.characterType = characterType;
        this.lifeMax = lifeMax;
        this.life = life;
        this.atk = atk;
    }

    public String getCharacterType() {
        return characterType;
    }

    public int getLifeMax() {
        return lifeMax;
    }

    public int getLife() {
        return life;
    }

    public int getAtk() {
        return atk;
    }

    public static void combat(Adventurer player,Character ennemie){
        String commande = "";
        boolean headShot = false;
        while(player.life > 0 && ennemie.life > 0){
            boolean isStunt = false;


            if(headShot == false){
                if(ennemie.characterType == "Barbare"){
                    ((Barbarian) ennemie).attack(player);
                    System.out.println("l'ennemie est vulnérable a votre épée");
                    commande = "sword";
                    System.out.println("vous avez: "+player.life+ " point de vie");
                }else{
                    isStunt = ((Wizzard) ennemie).attack(player);
                    System.out.println("l'ennemie est vulnérable a votre flasque");
                    commande = "flask";
                    System.out.println("vous avez: "+player.life+ " point de vie");
                }
            }


            if(player.life == 0){
                System.out.println("vous avez perdu");
                System.exit(0);
            }


            if (isStunt == false){
                boolean isValid =  Dongeon.CheckCommand(commande);
                if(ennemie.characterType == "Barbare"){
                    if(isValid){
                        headShot =  player.attackSword(ennemie);
                    }else{
                        System.out.println("cette arme n'existe pas vous passez votre tour");
                    }

                }else{
                    if(isValid){
                        player.attackFlask(ennemie);

                    }else{
                        System.out.println("cette arme n'existe pas vous passez votre tour");
                    }
                }
            }else{
                System.out.println("vous etes paralyser vous ne pouvez pas attaquer");
            }

        }
        player.nbWaterFlask = 0;
    }
}
