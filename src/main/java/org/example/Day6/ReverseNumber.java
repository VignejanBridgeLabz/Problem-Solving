package org.example.Day6;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int rev=0;
        while (n!=0){
            int reminder=n%10;
            rev=rev*10+reminder;
            n=n/10;
        }
        System.out.println("Reversed number: "+rev);
    }
}
