package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

/***
 * Représente un Donjon
 */
public class Dongeon {
    private Room[] mTotalRooms = new Room[5];

    /***
     * Constructeur du donjon
     */
    public Dongeon() {
        for (int i = 0; i < mTotalRooms.length; i++) {
            this.mTotalRooms[i] = new Room();
        }
    }

    public static void main(String[] args) {
        int nbRoom = 0;

        Character enemy;

        Adventurer player = new Adventurer("player",100,34);
        while (nbRoom !=5){
            Room first = new Room();
            System.out.println("Vous entrez dans une nouvelle salle, il y a un ennemie devant vous!");
            enemy = first.randomEnemy();
            enemy.combat(player,enemy);
            nbRoom++;
        }
        System.out.println("Vous avez gagné, vous entrez dans une nouvelle piece avec un trésor bien joué a vous!");

    }

    /**
     * Vérifier la commande entrée par l'utilisateur
     * @param commands la commande de l'utilisateur (String)
     * @return Vrai si la commande correspond à ce qui est attendu, sinon Faux
     */
    public static boolean CheckCommand(String commands){
        Scanner sc = new Scanner(System.in);
        String Usercommand = sc.nextLine();

        return Usercommand.equals(commands);
    }

    public static void printInfo(Character player,Character ennemie){
        System.out.println("il vous reste:"+player.life+" point de vie");

    }

}
