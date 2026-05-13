package org.example.Day14.StackUsingLinkedList;

public class Stack<T> {
    LinkedList<T> list = new LinkedList();

        void push(T x) {
            list.add(x);
        }

       void display() {
            list.display();
       }

       T peek() {
            return list.peek();
       }

       T pop() {
            return list.pop();
       }


}
