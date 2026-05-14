package org.example.Day15.HashTables;

public class Node<K,V>{
    MyMapNode<K,V> data;
    Node<K,V> next;

    public Node(MyMapNode<K,V> data) {
        this.data = data;
        this.next = null;
    }
}
