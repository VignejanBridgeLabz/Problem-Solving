package org.example.Day11.PlayingCards2;

class Card {
    String suit;
    String rank;
    Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }
    public String toString() {
        return rank + " of " + suit;
    }
}