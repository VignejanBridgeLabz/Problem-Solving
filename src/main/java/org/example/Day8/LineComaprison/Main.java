package org.example.Day8.LineComaprison;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Program...");
        Scanner sc = new Scanner(System.in);

        // First line input
        System.out.println("Enter the coordinates for the first line:");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Second line input
        System.out.println("Enter the coordinates for the second line:");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double x4 = sc.nextDouble();
        double y4 = sc.nextDouble();

        // 👉 PASS VALUES USING OBJECTS
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        Point p3 = new Point(x3, y3);
        Point p4 = new Point(x4, y4);

        CompareLength line1 = new CompareLength(p1, p2);
        CompareLength line2 = new CompareLength(p3, p4);

        Double length1 = line1.length();
        Double length2 = line2.length();

        System.out.println("Length of First Line: " + length1);
        System.out.println("Length of Second Line: " + length2);

        if(length1.equals(length2)){
            System.out.println("Both lines are equal");
        }
        else {
            System.out.println("Both lines are not equal");
        }

        // Compare lengths
        int result=length1.compareTo(length2);
        if (result == 0) {
            System.out.println("Both lines are equal");
        } else if (result > 0) {
            System.out.println("First line is greater than second line");
        } else {
            System.out.println("First line is smaller than second line");
        }
    }
}
