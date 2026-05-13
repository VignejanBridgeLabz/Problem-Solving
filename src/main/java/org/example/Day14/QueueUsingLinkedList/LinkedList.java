package org.example.Day14.QueueUsingLinkedList;



public class LinkedList<T> {
    Node<T> head;

    void append(T data) {
        Node<T> newNode = new Node<>(data);
        if(head == null) {
            head = newNode;
            return;
        }
       Node<T> temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void insert(T prevData,T newData) {
        Node<T> temp = head;
        while(temp.next != null&& temp.data != prevData) {
            temp=temp.next;
        }
        if(temp != null) {
            Node<T> newNode=new Node<T>(newData);
            newNode.next=temp.next;
            temp.next=newNode;
        }
    }

    //View the top Element
    T peek() {
        Node<T> temp = head;
        if(temp == null) {
            System.out.println("Empty List");
        }
        return temp.data;
    }

    //Remove the Top Element
    T pop() {
        if(head == null) {
            System.out.println("Empty List");
        }
        T popData= head.data;
        head = head.next;
        return popData;
    }
    void deleteLastElement() {
        Node<T> temp = head;
        if(head != null) {
            //if single node
            if(head.next == null) {
                head = null;
                return;
            }
            while(temp.next.next!= null) {
                temp = temp.next;
            }
            temp.next=null;
        }
        else {
            System.out.println("List is Empty");
            return;
        }
    }

    boolean find(T data) {
        Node<T> temp = head;
        while(temp!=null) {
            if(temp.data == data) {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    void insertAfter(T prevdata, T newData) {
        Node<T> temp = head;
        while(temp!=null && temp.data!= prevdata) {
            temp=temp.next;
        }
        Node<T> newNode = new Node<>(newData);
        newNode.next=temp.next;
        temp.next=newNode;
    }

    void deleteParticular(T data) {
        Node<T> temp = head;
        if (temp!= null) {
            while(temp.next != null) {
                if(temp.next.data == data) {
                    temp.next=temp.next.next;
                    return;
                }
                temp=temp.next;
            }
        }
        else{
            System.out.println("List is Empty");
        }
    }
    int size() {
        Node<T> temp = head;
        int count=0;
        while(temp!=null) {
            count++;
            temp=temp.next;
        }
        return count;
    }
    void display() {
        Node<T> temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}