package org.example.Day11.PlayingCards2;

class Player {
    String name;
    CardQueue cards = new CardQueue();

    Player(String name) {
        this.name = name;
    }

    void addCard(Card c) {
        cards.enqueue(c);
    }

    // Sort cards by rank
    void sortCards() {

        // Convert queue to array
        Card[] arr = new Card[9];
        Node temp = cards.front;
        int i = 0;

        while (temp != null) {
            arr[i++] = temp.data;
            temp = temp.next;
        }

        String[] order = {"2","3","4","5","6","7","8","9","10",
                "Jack","Queen","King","Ace"};

        // Bubble sort
        for (int j = 0; j < arr.length - 1; j++) {
            for (int k = j + 1; k < arr.length; k++) {

                if (getRank(arr[j].rank, order) >
                        getRank(arr[k].rank, order)) {

                    Card t = arr[j];
                    arr[j] = arr[k];
                    arr[k] = t;
                }
            }
        }

        // Put back to queue
        cards = new CardQueue();
        for (Card c : arr) {
            cards.enqueue(c);
        }
    }

    int getRank(String rank, String[] order) {
        for (int i = 0; i < order.length; i++) {
            if (order[i].equals(rank)) return i;
        }
        return -1;
    }

    void printCards() {
        System.out.println("\n" + name + ":");

        Node temp = cards.front;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}