package com.company;
import java.util.Scanner;

public class Dongeon {

    public static void main(String[] args) {
        int nbRoom = 0;

        Character ennemie;

        Barbarian paul = new Barbarian("barbare",100,45,45);
        Character player = new Character("player",100,3,34);
        while (nbRoom !=5){
            attaque(player);
        }



    }
    public static boolean CheckCommand(String Usercommand,String commands){


        return Usercommand.equals(commands);
    }

    public static void attaque(Character player){
        Scanner UserCommand = new Scanner(System.in);
        System.out.println("commande:");
        String command = UserCommand.nextLine();
        boolean test = CheckCommand(command,"sword");

        if (test == true){
            System.out.println("l'attaque est reussi");

        }else{
            System.out.println("mauvaise commande");
            attaque(player);
        }
    }
    public static void printInfo(Character player,Character ennemie){
        System.out.println("il vous reste:"+player.life+" point de vie");

    }

}
