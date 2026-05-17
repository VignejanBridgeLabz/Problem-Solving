package org.example.Day19;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    // UC1 - First Name
    public static boolean validateFirstName(String firstName) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return Pattern.matches(regex, firstName);
    }

    // UC2 - Last Name
    public static boolean validateLastName(String lastName) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return Pattern.matches(regex, lastName);
    }

    // UC3 - Email Validation
    public static boolean validateEmail(String email) {
        String regex = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";
        return Pattern.matches(regex, email);
    }

    // UC4 - Mobile Number Validation
    public static boolean validateMobile(String mobile) {
        String regex = "^[0-9]{2}\\s[0-9]{10}$";
        return Pattern.matches(regex, mobile);
    }

    // UC5 to UC8 - Password Validation
    public static boolean validatePassword(String password) {
        // Rule 1: Minimum 8 characters
        boolean rule1 = password.length() >= 8;

        // Rule 2: At least 1 uppercase letter
        boolean rule2 = password.matches(".*[A-Z].*");

        // Rule 3: At least 1 numeric number
        boolean rule3 = password.matches(".*[0-9].*");

        // Rule 4: Exactly 1 special character
        String specialChars = password.replaceAll("[a-zA-Z0-9]", "");
        boolean rule4 = specialChars.length() == 1;

        return rule1 && rule2 && rule3 && rule4;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First Name
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.println("Valid First Name: " + validateFirstName(firstName));

        // Last Name
        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();
        System.out.println("Valid Last Name: " + validateLastName(lastName));

        // Email
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.println("Valid Email: " + validateEmail(email));

        // Mobile
        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();
        System.out.println("Valid Mobile Number: " + validateMobile(mobile));

        // Password
        System.out.print("Enter Password: ");
        String password = sc.nextLine();
        System.out.println("Valid Password: " + validatePassword(password));
    }
}
