package com.company;
import java.util.Scanner;

public class Dongeon {

    public static void main(String[] args) {
        int nbRoom = 0;

        Character ennemie;


        Character player = new Character("player",100,3,34);
        while (nbRoom !=5){
            Room first = new Room();
            ennemie = first.randomEnemy();
            if (ennemie.characterType == "barbare"){
                Barbarian barbare = (Barbarian) ennemie;
            }
            attaque(player,ennemie);
        }



    }
    public static boolean CheckCommand(String Usercommand,String commands){


        return Usercommand.equals(commands);
    }

    public static void attaque(Character player, Character ennemie){
        Scanner UserCommand = new Scanner(System.in);
        String commande;
        boolean isStunt = false;
        if (ennemie.characterType.equals("barbare")){
            System.out.println("le barbare est faible face a l'épée, utilisez la!");
            commande = "sword";
        }else{
            System.out.println("le magicien est faible face a la flasque, utilisez la!");
            commande = "flask";
        }

        System.out.println("commande:");
        String command = UserCommand.nextLine();
        boolean test = CheckCommand(command,"sword");

        if (test == true){

            System.out.println("l'attaque est reussi");

        }else{
            System.out.println("mauvaise commande");
            attaque(player,ennemie);
        }
    }
    public static void printInfo(Character player,Character ennemie){
        System.out.println("il vous reste:"+player.life+" point de vie");

    }

}
