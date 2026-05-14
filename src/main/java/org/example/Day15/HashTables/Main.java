package org.example.Day15.HashTables;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String sentence="To be or not to be";

        String[] strArray = sentence.toLowerCase().split(" ");

        //Create HashTable
        MyHashTable<String,Integer> myHashTable = new MyHashTable<>();

        for(String word : strArray){
            Integer wordCount = myHashTable.get(word);
            if(wordCount==null){
                myHashTable.put(word,1);
            }else{
                myHashTable.put(word,wordCount+1);
            }
        }

        System.out.println("Hash Table");
        myHashTable.display();

    }
}
