package org.example.Day8.EmployeeWage;

import java.util.Random;

public class EmployeeWage {

    // UC-7: Class Variables
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 8;
    static final int WORKING_DAYS = 20;
    static final int MAX_HOURS = 100;

    static final int ABSENT = 0;
    static final int FULL_TIME = 1;
    static final int PART_TIME = 2;

    Random random = new Random();

    // UC-7: Class Method
    public void computeEmployeeWage() {

        System.out.println("Welcome to Employee Wage Computation Program");

        int totalWage = 0;
        int totalHours = 0;
        int totalDays = 0;

        // UC-6: Condition based loop
        while (totalHours < MAX_HOURS && totalDays < WORKING_DAYS) {

            totalDays++;
            int empType = random.nextInt(3);
            int empHours = 0;

            // UC-4: Switch Case
            switch (empType) {

                case FULL_TIME:
                    empHours = FULL_DAY_HOUR;
                    break;

                case PART_TIME:
                    empHours = PART_TIME_HOUR;
                    break;

                default:
                    empHours = 0;
            }

            int dailyWage = empHours * WAGE_PER_HOUR;
            totalHours += empHours;
            totalWage += dailyWage;

            System.out.println("Day " + totalDays +
                    " | Hours Worked: " + empHours +
                    " | Daily Wage: $" + dailyWage);
        }

        // UC-5: Monthly Wage
        System.out.println("\nTotal Working Days: " + totalDays);
        System.out.println("Total Working Hours: " + totalHours);
        System.out.println("Total Monthly Wage: $" + totalWage);
    }

    // Main Method

}
