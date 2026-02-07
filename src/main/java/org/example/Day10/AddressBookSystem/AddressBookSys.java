package org.example.Day10.AddressBookSystem;

import org.example.Day9.AddressBook.AddressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookSys {
    public static List<Contacts> contacts=new ArrayList<Contacts>();

    public void addContact(Contacts contact) {
        contacts.add(contact);
        System.out.println("Added contact Successfully");
        System.out.println(contact);
    }
    public static void editContact(Scanner sc,String firstName1) {
        for(Contacts contact :contacts){
            if(contact.getFirstName().equals(firstName1)){

                System.out.println("Enter your new First Name : ");
                String firstName2 = sc.nextLine();
                contact.setFirstName(firstName2);
                System.out.println("Enter your new Last Name : ");
                String lastName2 = sc.nextLine();
                contact.setLastName(lastName2);
                System.out.println("Enter the Address : ");
                String address = sc.nextLine();
                contact.setAddress(address);
                System.out.println("Enter the state: ");
                String state = sc.nextLine();
                contact.setState(state);
                System.out.println("Enter the city: ");
                String city = sc.nextLine();
                contact.setCity(city);
                System.out.println("Enter the ZIP code: ");
                String zip = sc.nextLine();
                contact.setZip(zip);
                System.out.println("Enter your new Contact Number : ");
                Long contactNumber = sc.nextLong();
                contact.setPhone(contactNumber);
                System.out.println("Enter your Email: ");
                String email = sc.nextLine();
                contact.setEmail(email);

                System.out.println("Contacts are Edited Successfully");
                break;
            }
            else{
                System.out.println("Name of the Contact does not exist");
                return;
            }
        }
    }

    public void deleteContact(String firstName2) {

        for(Contacts contact :contacts){
            if(contact.getFirstName().equals("firstName") ){
                contacts.remove(contact);
            }
        }
        System.out.println("Deleted Contact Successfully");
    }

}
