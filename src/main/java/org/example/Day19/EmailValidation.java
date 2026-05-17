package org.example.Day19;

import java.util.regex.Pattern;

public class EmailValidation {
    // Email Regex
    public static final String EMAIL_REGEX =
            "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}(\\.[a-zA-Z]{2})?$";

    public static boolean validateEmail(String email) {
        return Pattern.matches(EMAIL_REGEX, email);
    }

    public static void main(String[] args) {

        // Valid Emails
        String[] validEmails = {
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc111@abc.com",
                "abc-100@abc.net",
                "abc.100@abc.com.au",
                "abc@1.com",
                "abc@gmail.com.com",
                "abc+100@gmail.com"
        };

        // Invalid Emails
        String[] invalidEmails = {
                "abc",
                "abc@.com.my",
                "abc123@gmail.a",
                "abc123@.com",
                "abc123@.com.com",
                ".abc@abc.com",
                "abc()*@gmail.com",
                "abc@%*.com",
                "abc..2002@gmail.com",
                "abc.@gmail.com",
                "abc@abc@gmail.com",
                "abc@gmail.com.1a",
                "abc@gmail.com.aa.au"
        };

        System.out.println("===== VALID EMAIL TESTS =====");
        for (String email : validEmails) {
            System.out.println(email + " -> " + validateEmail(email));
        }

        System.out.println("\n===== INVALID EMAIL TESTS =====");
        for (String email : invalidEmails) {
            System.out.println(email + " -> " + validateEmail(email));
        }
    }
}
