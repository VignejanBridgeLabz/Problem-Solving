package org.example.Day5.FunctionalProgram;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        double delta = b*b-4*a*c;

        double root1=(-b + sqrt(delta))/(2*a);
        double root2=(-b - sqrt(delta))/(2*a);

        System.out.println("Root1: "+root1);
        System.out.println("Root2: "+root2);
    }
}
