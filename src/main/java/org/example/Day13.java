package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Day13 {

    static class Stock {
        String name; int numberOfShares; double sharePrice;
        Stock(String name, int numberOfShares, double sharePrice) {
            this.name = name; this.numberOfShares = numberOfShares; this.sharePrice = sharePrice;
        }
        double getValue() { return numberOfShares * sharePrice; }
        void printStock() {
            System.out.printf("%-15s | Shares: %5d | Price: %8.2f | Value: %10.2f%n",
                    name, numberOfShares, sharePrice, getValue());
        }
    }

    static class StockPortfolio {
        List<Stock> stocks = new ArrayList<>();
        void addStock(Stock stock) { stocks.add(stock); }
        double getTotalValue() {
            double total = 0; for (Stock s : stocks) total += s.getValue(); return total;
        }
        void printReport() {
            System.out.println("\n===== Stock Portfolio Report =====");
            for (Stock s : stocks) s.printStock();
            System.out.printf("Total Value: %.2f%n", getTotalValue());
        }
    }

    static class Account {
        private String ownerName; private double balance;
        Account(String ownerName, double balance) { this.ownerName = ownerName; this.balance = balance; }
        void debit(double amount) {
            if (amount > balance) System.out.println("Debit amount exceeded account balance.");
            else { balance -= amount; System.out.printf("Debited: %.2f | Balance: %.2f%n", amount, balance); }
        }
        double getBalance() { return balance; }
    }

    static class Card {
        String suit, rank;
        Card(String suit, String rank) { this.suit = suit; this.rank = rank; }
        public String toString() { return rank + " of " + suit; }
    }

    static class DeckOfCards {
        static final String[] SUITS = {"Clubs","Diamonds","Hearts","Spades"};
        static final String[] RANKS = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        Card[] deck = new Card[52];
        DeckOfCards() {
            int i = 0;
            for (String s : SUITS) for (String r : RANKS) deck[i++] = new Card(s, r);
        }
        void shuffle() {
            Random rand = new Random();
            for (int i = deck.length - 1; i > 0; i--) {
                int j = rand.nextInt(i + 1); Card t = deck[i]; deck[i] = deck[j]; deck[j] = t;
            }
        }
        void dealAndPrint() {
            int players = 4, cardsEach = 9;
            String[][] playerCards = new String[players][cardsEach];
            int idx = 0;
            for (int p = 0; p < players; p++) for (int c = 0; c < cardsEach; c++) playerCards[p][c] = deck[idx++].toString();
            System.out.println("\n===== Deck of Cards =====");
            for (int p = 0; p < players; p++) {
                System.out.println("Player " + (p + 1) + ":");
                for (int c = 0; c < cardsEach; c++) System.out.println("  " + playerCards[p][c]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Day 13: OOPs Problems ===");
        StockPortfolio portfolio = new StockPortfolio();
        portfolio.addStock(new Stock("TCS", 100, 3500.00));
        portfolio.addStock(new Stock("Infosys", 200, 1500.00));
        portfolio.addStock(new Stock("Wipro", 150, 450.00));
        portfolio.printReport();
        Account acc = new Account("Vignejan", 5000.00);
        acc.debit(1000.00); acc.debit(6000.00);
        DeckOfCards deck = new DeckOfCards(); deck.shuffle(); deck.dealAndPrint();
    }
}
