package org.example.Day5.FunctionalProgram;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;

public class TwoDArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        System.out.print("Enter number of rows: ");
        int M = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int N = sc.nextInt();
        int[][] array = new int[M][N];

        System.out.println("Enter " + (M * N) + " elements:");

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        out.println("2D Array Output:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                out.print(array[i][j] + " ");
            }
            out.println();
        }
    }
}
