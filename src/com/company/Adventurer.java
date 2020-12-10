package com.company;

public class Adventurer  extends Character{
    public Adventurer(String characterType, int lifeMax, int life, int atk) {
        super(characterType, lifeMax, life, atk);
    }
    public int nbWaterFlask = 0;
    public boolean attackSword(Character ennemyObject){
            int i = 1 + (int) (Math.random() * ((10 - 1) + 1));
            ennemyObject = (Barbarian) ennemyObject;
            if(i < 2){
                System.out.println("vous avez toucher le barbare a la tete il est étourdit, profitez-en!");
                ennemyObject.life -= this.atk;
                System.out.println("vous infligez au barbare: "+this.atk+" point de dégats");
                System.out.println("il reste au barbare: "+ennemyObject.life+" point de vie");
                return true;
            }else{
                ennemyObject.life -= this.atk;
                System.out.println("vous infligez au barbare: "+this.atk+" point de dégats");
                System.out.println("il reste au barbare: "+ennemyObject.life+" point de vie");
                return false;
            }




    }
    public void attackFlask(Character ennemyObject){
            nbWaterFlask++;

            ennemyObject = (Wizzard) ennemyObject;
            ennemyObject.life -= nbWaterFlask*2+this.atk;
            int degat = nbWaterFlask*2+this.atk;
            System.out.println("vous infligez au magicien: "+degat+" point de vie");
            System.out.println("il reste au magicien: "+ennemyObject.life+" point de vie");

    }
}
