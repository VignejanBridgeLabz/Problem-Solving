package org.example.Day6;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println("Press Enter to start the stopwatch...");
//        sc.nextLine();
//        long startTime = System.currentTimeMillis();
//        System.out.println(startTime);
//
//        System.out.println("Press Enter to stop the stopwatch...");
//        sc.nextLine();
//
//        long endTime = System.currentTimeMillis();
//
//        long elapsedTime = endTime - startTime;
//        System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");

        System.out.println("Press Enter to stop the stopwatch...");
        sc.nextLine();
        LocalTime start = LocalTime.now();
        System.out.println("Press Enter to stop the stopwatch...");
        sc.nextLine();
        LocalTime end = LocalTime.now();
        Duration duration = Duration.between(start, end);
        System.out.println("Elapsed Time: " + duration + " milliseconds");

    }
}
