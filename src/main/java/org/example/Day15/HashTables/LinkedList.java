package org.example.Day15.HashTables;

public class LinkedList <K,V>{
    Node<K,V> head;

    MyMapNode<K,V> search(K key){
        Node<K,V> temp = head;

        while(temp!=null){
            if(temp.data.key.equals(key)){
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    //Add node
    void add(MyMapNode<K,V> data){
        Node<K,V> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    void display(){
        Node<K,V> temp = head;
        while(temp!=null){
            System.out.println(temp.data.key+" -> "+temp.data.value);
            temp = temp.next;
        }

    }

}
