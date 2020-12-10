package com.company;
import java.util.Scanner;

public class Dongeon {
    private Room[] mTotalRooms = new Room[5];

    public Dongeon() {
        for (int i = 0; i < mTotalRooms.length; i++) {
            this.mTotalRooms[i] = new Room();
        }
    }

    public static void main(String[] args) {
        int nbRoom = 0;

         Character enemy;


        Adventurer player = new Adventurer("player",100,100,34);
        while (nbRoom !=5){
            Room first = new Room();
            enemy = first.randomEnemy();
            enemy.combat(player,enemy);
            nbRoom = 5;

        }


    }
    public static boolean CheckCommand(String commands){
        Scanner sc = new Scanner(System.in);
        String Usercommand = sc.nextLine();

        return Usercommand.equals(commands);
    }




    public static void printInfo(Character player,Character ennemie){
        System.out.println("il vous reste:"+player.life+" point de vie");

    }

}
