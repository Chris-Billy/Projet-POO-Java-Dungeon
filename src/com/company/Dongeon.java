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

        attaque();

    }
    public static boolean CheckCommand(String Usercommand,String commands){


        return Usercommand.equals(commands);
    }

    public static void attaque(){
        Scanner UserCommand = new Scanner(System.in);
        System.out.println("commande:");
        String command = UserCommand.nextLine();
        boolean test = CheckCommand(command,"sword");
        if (test == true){
            System.out.println("l'attaque est reussi");
        }else{
            System.out.println("l'attaque est raté");
            attaque();
        }
    }

}
