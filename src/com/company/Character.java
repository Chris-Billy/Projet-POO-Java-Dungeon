package com.company;

/***
 * Représente un personnage
 */
public class Character {

    protected String characterType;
    int life;
    protected int atk;

    /**
     * Constructeur d'un personnage
     * @param characterType Type du personnage (String)
     * @param life point de vie du personnage (Int)
     * @param atk point d'attaque du personnage (Object)
     */
    public Character(String characterType, int life, int atk) {
        this.characterType = characterType;
        this.life = life;
        this.atk = atk;
    }

    /***
     * Permet de lancer un combat entre deux personnages
     * @param player une instance de personnage (Object)
     * @param ennemie une instance de personnage (Object)
     */
    public static void combat(Adventurer player,Character ennemie){
        String commande = "";
        boolean headShot = false;
        while(player.life > 0 && ennemie.life > 0){
            boolean isStunt = false;

            if(headShot == false){
                if(ennemie.characterType == "Barbare"){
                    ((Barbarian) ennemie).attack(player);
                    if(player.life <= 0){
                        System.out.println("vous avez perdu");
                        System.exit(0);
                    }
                    System.out.println("l'ennemie est vulnérable a votre épée");
                    commande = "sword";
                    System.out.println("vous avez: "+player.life+ " point de vie");
                }else{
                    isStunt = ((Wizzard) ennemie).attack(player);
                    if(player.life <= 0){
                        System.out.println("vous avez perdu");
                        System.exit(0);
                    }
                    System.out.println("l'ennemie est vulnérable a votre flasque");
                    commande = "flask";
                    System.out.println("vous avez: "+player.life+ " point de vie");
                }
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
