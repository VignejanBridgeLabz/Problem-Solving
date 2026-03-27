package org.example.Day11.PlayingCards2;

class PlayerNode {
    Player data;
    PlayerNode next;

    PlayerNode(Player data) {
        this.data = data;
    }
}

class PlayerQueue {
    PlayerNode front, rear;

    void enqueue(Player p) {
        PlayerNode newNode = new PlayerNode(p);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    void displayAll() {
        PlayerNode temp = front;

        while (temp != null) {
            temp.data.printCards();
            temp = temp.next;
        }
    }
}
