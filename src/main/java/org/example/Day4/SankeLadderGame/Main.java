package org.example.Day4.SankeLadderGame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Welcome to the Snake and Ladder Game");

//        UseCase-1
        int playerPosition=0;
        System.out.println("Player Start Position "+playerPosition);

//        Usecase-2
        GamePlay gp=new GamePlay();

//        gp.playeTheGame(playerPosition);
//        gp.witTwoPlayer();

    }

}
