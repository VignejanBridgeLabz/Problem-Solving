package org.example.Day24;

import java.util.Scanner;

public class AddressBookSystem {
    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Address Book Program!");
        System.out.println("Enter Contact Details:");

        System.out.print("First Name: ");
        String fName = sc.nextLine();

        System.out.print("Last Name: ");
        String lName = sc.nextLine();

        System.out.print("Address: ");
        String address = sc.nextLine();

        System.out.print("City: ");
        String city = sc.nextLine();

        System.out.print("State: ");
        String state = sc.nextLine();

        System.out.print("Zip: ");
        String zip = sc.nextLine();

        System.out.print("Phone: ");
        String phone = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        Contact contact = new Contact(fName, lName, address, city, state, zip, phone, email);
        addressBook.addContact(contact);

        System.out.println("\nAll Contacts: ");
        addressBook.getContacts().forEach(System.out::println);
    }
}