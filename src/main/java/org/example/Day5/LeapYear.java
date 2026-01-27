package org.example.Day5;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year: ");
        int n=sc.nextInt();
        if(n< 999 || n>10000){
            System.out.println("Please enter a 4 digit number");
            return;
        }
        if((n%4==0)||((n%400==0)&&(n%100!=0))){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        }
    }
}
