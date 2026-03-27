package org.example.Day11.PlayingCards2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8",
                "9", "10", "Jack", "Queen", "King", "Ace"};

        Card[] deck = new Card[52];
        int index = 0;

        // Create deck
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index++] = new Card(suits[i], ranks[j]);
            }
        }

        // Shuffle
        Random rand = new Random();
        for (int i = 0; i < 52; i++) {
            int r = rand.nextInt(52);

            Card temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }

        // Create player queue
        PlayerQueue pq = new PlayerQueue();

        Player[] players = new Player[4];

        for (int i = 0; i < 4; i++) {
            players[i] = new Player("Player " + (i + 1));
            pq.enqueue(players[i]);
        }

        // Distribute cards
        int cardIndex = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                players[i].addCard(deck[cardIndex++]);
            }
        }

        // Sort cards
        for (int i = 0; i < 4; i++) {
            players[i].sortCards();
        }

        // Print using Player Queue
        pq.displayAll();
    }
}
