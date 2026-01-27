package org.example.Day5;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        if (N <= 1) {
            System.out.println("Please enter a number greater than 1");
            return;

        }
        System.out.print("Prime factors are: ");
        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                System.out.print(i + " ");
                N = N / i;
            }
        }
        if (N > 1) {
            System.out.print(N);
        }
    }
}





