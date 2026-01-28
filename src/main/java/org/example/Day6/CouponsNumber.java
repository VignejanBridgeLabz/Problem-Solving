package org.example.Day6;

import java.util.Random;
import java.util.Scanner;

public class CouponsNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[] ar=new int[n];
        int distinct=0;
        int total=0;

        while (distinct < n) {
            int num = random(n);
            total++;
            boolean found=false;

            for (int i=0;i<distinct;i++) {
                if (ar[i]==num) {
                    found=true;
                    break;
                }
            }

            if (!found) {
                ar[distinct]=num;
                distinct++;
            }
        }

        System.out.println("Total random numbers needed: " + total);
    }
    static int random(int n) {
        Random rand = new Random();
        return rand.nextInt(n);
    }
}
