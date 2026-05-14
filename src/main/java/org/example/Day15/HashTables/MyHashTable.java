package org.example.Day15.HashTables;

public class MyHashTable<K, V> {
    LinkedList<K,V>[] table;

    MyHashTable(){
        table = new LinkedList[10];
        for(int i=0;i<table.length;i++){
            table[i] = new LinkedList<>();
        }
    }

    int getIndex(K key){
        return Math.abs(key.hashCode() % table.length);
    }
    void put(K key,V value) {
        int index = getIndex(key);
        LinkedList<K, V> list = table[index];
        MyMapNode<K, V> existingNode = list.search(key);

        //if key not present
        if (existingNode == null) {
            list.add(new MyMapNode<>(key, value));
        } else {
            //update the value
            existingNode.value = value;
        }
    }
        // Get Value
         V get(K key) {
            int index = getIndex(key);
            LinkedList<K, V> list = table[index];
            MyMapNode<K, V> node = list.search(key);
            if (node == null) {
                return null;
            }
            return node.value;
        }

        void display(){
        for(int i=0;i<table.length;i++){
            table[i].display();
        }
        }

}
