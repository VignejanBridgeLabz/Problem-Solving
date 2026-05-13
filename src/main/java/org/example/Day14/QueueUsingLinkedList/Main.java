package org.example.Day14.QueueUsingLinkedList;

public class Main {
    public static void main(String[] args) {
       Queue<Integer> queue = new Queue<>();
       queue.enqueue(56);
       queue.enqueue(30);
       queue.enqueue(70);

        System.out.println("After enqueueing the 3 Elements");
        queue.display();

        System.out.println("After dequeue the Element");
        queue.dequeue();
        queue.display();
    }
}
