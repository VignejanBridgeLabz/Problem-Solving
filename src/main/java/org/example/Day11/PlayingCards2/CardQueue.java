package org.example.Day11.PlayingCards2;

class CardQueue {
    Node front, rear;

    void enqueue(Card c) {
        Node newNode = new Node(c);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    Card dequeue() {
        if (front == null) return null;

        Card temp = front.data;
        front = front.next;

        if (front == null) rear = null;

        return temp;
    }

    boolean isEmpty() {
        return front == null;
    }
}