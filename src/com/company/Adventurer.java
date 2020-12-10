package com.company;

public class Adventurer  extends Character{
    public Adventurer(String characterType, int life, int atk) {
        super(characterType, life, atk);
    }
    public void attackSword(Character ennemyObject){
        if(ennemyObject.characterType == "Barbare"){
            ennemyObject = (Barbarian) ennemyObject;
            ennemyObject.life -= this.atk;
            System.out.println("il reste au barbare: "+ennemyObject.life+" point de vie");
        }else{
            ennemyObject = (Wizzard) ennemyObject;
            ennemyObject.life -= this.atk;
            System.out.println("il reste au magicien: "+ennemyObject.life+" point de vie");
        }
    }
    public void attackFlask(Character ennemyObject){

    }
}
