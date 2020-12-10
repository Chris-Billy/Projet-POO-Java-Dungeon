package com.company;

import java.sql.SQLOutput;

public class Character {

    protected String characterType;
    int life;
    protected int atk;

    public Character(String characterType, int life, int atk) {
        this.characterType = characterType;
        this.life = life;
        this.atk = atk;
    }

    public String getCharacterType() {
        return characterType;
    }

    public int getLife() {
        return life;
    }

    public int getAtk() {
        return atk;
    }

    public static void combat(Adventurer player,Character ennemie){
        String commande;
        while(player.life > 0 && ennemie.life > 0){
            if(ennemie.characterType == "Barbare"){
                ((Barbarian) ennemie).attack(player);
                commande = "sword";
                System.out.println("vous avez: "+player.life+ " point de vie");
            }else{
                ((Wizzard) ennemie).attack(player);
                commande = "flask";
            }
            boolean isValid =  Dongeon.CheckCommand(commande);
            if(ennemie.characterType == "Barbare"){
                if(isValid){
                    player.attackSword(ennemie);
                }else{

                }

            }else{
                if(isValid){
                    player.attackSword(ennemie);
                }
            }
        }
    }
}
