package org.example.Day3.LineComparison;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Line Comparison Computation Program");
        System.out.println("Enter the coordinates for the first line:");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.println("Enter the coordinates for the second line:");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double x4 = sc.nextDouble();
        double y4 = sc.nextDouble();

        LineCompare Line = new LineCompare();


        Double lenght1= Line.lenghtOftheLine(x1,y1,x2,y2);
        Double length2= Line.lenghtOftheLine(x3,y3,x4,y4);

        if(lenght1.equals(length2)){
            System.out.println("Both lines are equal");
        }
        else {
            System.out.println("Both lines are not equal");
        }

        int result=lenght1.compareTo(length2);
        if(result==0){
            System.out.println("First line is equal to Second line");
        }
        else if(result>0){
            System.out.println("First line is greater than Second line");
        }
        else if(result<0){
            System.out.println("First line is less than Second line");
        }
    }
}
