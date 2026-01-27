package org.example.Day5;

import java.util.Scanner;

public class EvenOrAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entet the number: ");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}
