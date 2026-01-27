package org.example.Day4.SankeLadderGame;

import java.util.Random;

public class GamePlay {

    public void playeTheGame(int playerPosition){
        int dicecount=0;
        int pos=playerPosition;
        Random rand=new Random();
        while(pos<100){
            dicecount++;
            int previousPosition=pos;
            int die=rand.nextInt(6)+1;
        int option=rand.nextInt(3);

            //option0:NO move
            //option1:Ladder
            //option2:Snake


        if(option==0){
//            pos=0;
        }
        else if(option==1){
           pos =pos+die;
        } else if (option==2) {
            pos=pos-die;
        }
        if(pos<0){
            pos=0;
        }
        if(pos>100){
            pos=previousPosition;
        }
        //Use case 6
        System.out.println("Die "+die+" Player Position "+pos);
        if(pos==100){
            System.out.println("Position Reached 100 Won the game");
            System.out.println("Total Dice Rolls "+dicecount);
            System.out.println("Game Over");
            break;
        }
        }

    }
    public void witTwoPlayer(){

        int player1Position=0;
        int player2Position=0;
        int currentPlayer=1;
        int dicecount=0;

        Random rand=new Random();
        while(player1Position<100 && player2Position<100) {
            dicecount++;
            int option = rand.nextInt(3);
            //option0:NO move
            //option1:Ladder
            //option2:Snake
            int die = rand.nextInt(6) + 1;
            if (currentPlayer == 1) {
                int previousPosition = player1Position;

                if (option == 0) {
//            pos=0;
                } else if (option == 1) {
                    player1Position = player1Position + die;
                } else if (option == 2) {
                    player1Position = player1Position - die;
                }
                if (player1Position < 0) {
                    player1Position = 0;
                }
                if (player1Position > 100) {
                    player1Position = previousPosition;
                }
                System.out.println("Die " + die + " Player 1 Position " + player1Position);
            } else if (currentPlayer == 2) {

                int previousPosition = player2Position;
                if (option == 0) {
//            pos=0;
                } else if (option == 1) {
                    player2Position = player2Position + die;
                } else if (option == 2) {
                    player2Position = player2Position - die;
                }
                if (player2Position < 0) {
                    player2Position = 0;
                }
                if (player2Position > 100) {
                    player2Position = previousPosition;

                }
                System.out.println("Die " + die + " Player 2 Position " + player2Position);
            }

            //Use Case 7
            currentPlayer = option == 1 ? currentPlayer : currentPlayer == 1 ? 2 : 1;

            if (player1Position == 100) {
                System.out.println("Position Reached 100 Player 1 Won the game");
                System.out.println("Total Dice Rolls " + dicecount);
                System.out.println("Game Over");
                break;
            }
            else if(player2Position == 100){
                System.out.println("Position Reached 100 Player 2 Won the game");
                System.out.println("Total Dice Rolls " + dicecount);
                System.out.println("Game Over");
                break;
            }
        }

    }
}
