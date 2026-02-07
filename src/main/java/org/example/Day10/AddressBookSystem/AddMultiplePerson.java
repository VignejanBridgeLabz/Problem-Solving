package org.example.Day10.AddressBookSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class AddMultiplePerson {

    public static void  addMultiPerson(String name,Contacts contact){
        Scanner sc=new Scanner(System.in);
        Map<String,Contacts> map = new HashMap<>();
        map.put(name,contact);
        System.out.println(map);

        System.out.println("The Available Address Books Are");
        for(Map.Entry<String,Contacts> entry:map.entrySet()){
            System.out.println(entry.getKey());
        }
        System.out.println("If you want to view the Book Address");
        String s=sc.nextLine();
        if(s.equalsIgnoreCase("yes")){
        for(Map.Entry<String,Contacts> entry:map.entrySet()){
            System.out.println(entry.getValue());
        }
        }

    }
}
