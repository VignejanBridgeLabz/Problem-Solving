package org.example.Day5.FunctionalProgram;

public class Distance {
    public static void main(String[] args) {

        // Check if two arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide two integer arguments x and y");
            return;
        }
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        double distance = Math.sqrt(
                Math.pow(x, 2) + Math.pow(y, 2)
        );
        System.out.println("Distance from (" + x + ", " + y + ") to (0, 0) is: " + distance);
    }
}
