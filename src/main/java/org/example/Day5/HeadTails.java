package org.example.Day5;

import java.util.Scanner;

public class HeadTails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of time want flip the coin:");
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Please enter a positive integer");
            return;
        }
        int head = 0;
        int tail = 0;
        for (int i = 1; i <= n; i++) {
            double value=Math.random();
            if(value<0.5){
                head++;
            }
            else{
                tail++;
            }
        }
        System.out.println("THe percentage of the Head is: "+(head*100)/n+"%");
        System.out.println("THe percentage of the Head is: "+(tail*100)/n+"%");
    }
}
