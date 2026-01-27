package org.example.Day5;


public class PowerOfTwo {

        public static void main(String[] args) {

            // Check if argument is provided
            if (args.length == 0) {
                System.out.println("Please provide a value for N");
                return;
            }

            int N = Integer.parseInt(args[0]);

            // Validate N
            if (N < 0 || N >= 31) {
                System.out.println("N must be between 0 and 30");
                return;
            }

            int power = 1;

            for (int i = 0; i <= N; i++) {
                System.out.println("2^" + i + " = " + power);
                power = power * 2;
            }
        }
}



