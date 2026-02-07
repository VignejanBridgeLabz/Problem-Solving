package org.example.Day10.AddressBookSystem;


import org.example.Day10.AddressBookSystem.AddressBookSys;


import java.util.Scanner;

import static org.example.Day10.AddressBookSystem.AddMultiplePerson.addMultiPerson;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to AddressBook System");

        AddressBookSys addressBook = new AddressBookSys();

        while (true) {
            System.out.println("1.Add Contact");
            System.out.println("2.Edit Contact");
            System.out.println("3.Remove Contact");
            System.out.println("4.View All Contacts");
            System.out.println("5.Exit");

            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 1) {

//                UseCase-1
                System.out.println("Enter the Address Book  :");
                String tname=sc.nextLine();

                System.out.println("Enter your first name:");
                String firstName = sc.nextLine();
                System.out.println("Enter your last name:");
                String lastName = sc.nextLine();
                System.out.println("Enter your address:");
                String address = sc.nextLine();
                System.out.println("Enter your State:");
                String state = sc.nextLine();
                System.out.println("Enter your city:");
                String city = sc.nextLine();
                System.out.println("Enter your ZIP code:");
                String zipCode = sc.nextLine();
                System.out.println("Enter your phone number:");
                Long phoneNumber = sc.nextLong();
                sc.nextLine();
                System.out.println("Enter your email address:");
                String email = sc.nextLine();

                Contacts contacts = new Contacts(firstName, lastName, address, state, city, zipCode, phoneNumber, email);
                addressBook.addContact(contacts);

                addMultiPerson(tname,new Contacts(firstName, lastName, address, state, city, zipCode, phoneNumber, email));


            } else if (choice == 2) {
                System.out.println("If you want Edit the Exit List Of Contacts...");
                String s = sc.nextLine();
                if (s.equalsIgnoreCase("Yes")) {
                    System.out.println("Enter your firstname: ");
                    String firstName1 = sc.nextLine();
                    AddressBookSys.editContact(sc, firstName1);
                } else {
                    System.out.println("Thank you...");
                    System.out.println("If you want continue");
                    String st = sc.nextLine();
                    if (st.equalsIgnoreCase("Yes")) {
                        continue;
                    } else {
                        System.out.println("Program Exit");
                        return;
                    }
                }
            } else if (choice == 3) {
                System.out.println("Delete contact if you want to Delete Contacts...");
                String s = sc.nextLine();

                if (addressBook.contacts.isEmpty()) {
                    System.out.println("This list is empty");
                    System.out.println();
                } else {
                    if (s.equalsIgnoreCase("Yes")) {
                        System.out.println("Enter your firstname: ");
                        String firstName2 = sc.nextLine();
                        addressBook.deleteContact(firstName2);
                    } else {
                        System.out.println("Thank you...");
                        System.out.println("If you want continue");
                        String st = sc.nextLine();
                        if (st.equalsIgnoreCase("Yes")) {
                            continue;
                        } else {
                            System.out.println("Program Exit");
                            break;

                        }
                    }
                }
            }
            else if (choice == 4) {
                if (addressBook.contacts.isEmpty()) {
                    System.out.println("This list is empty");
                    System.out.println();
                } else {
                    System.out.println(addressBook.contacts);
                    System.out.println();
                }
            }
            else if (choice == 5) {
                System.out.println("Program Exit");
                break;
            }
        }
    }

}
