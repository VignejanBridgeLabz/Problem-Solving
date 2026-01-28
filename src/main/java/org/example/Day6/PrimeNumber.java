package org.example.Day6;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int temp = 0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                temp++;
            }
        }
            if(temp==2){
                System.out.println(num+" is a prime number");
            }
            else{
                System.out.println(num+" is not a prime number");
            }
    }
}
