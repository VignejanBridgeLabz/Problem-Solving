package org.example.Day14.QueueUsingLinkedList;

public class Queue<T>{
    LinkedList<T> list=new LinkedList<>();

    void enqueue(T data){
        list.append(data);
    }
    void dequeue(){
        list.pop();
    }
    void display(){
        list.display();
    }
}
