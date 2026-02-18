package org.example.Day10.EmployeeWage;

import java.util.Random;

public class EmployeeWageCalculation {
        static int maxHrs=100;
        static int maxDays=20;
        static int wagePerHr=20;

        static final int FULL_DAY_HOUR=8;
        static final int PART_TIME_HOUR=4;

        static int totalHr=0;
        static int totalDays=0;

        public static void wageComputation(){

            Random rand=new Random();

            while(totalDays<maxDays && totalHr<maxHrs){

                totalDays++;
                int empHR=0;
                int n=rand.nextInt(3);

                switch(n){
                    case 1:
                        System.out.println("Full Time Employee");
                        empHR=FULL_DAY_HOUR;
                        break;

                    case 2:
                        System.out.println("Part Time Employee");
                        empHR=PART_TIME_HOUR;
                        break;

                    default:
                        System.out.println("Employee is Absent");
                        empHR=0;
                }

                if(totalHr+empHR<=maxHrs){
                    totalHr+=empHR;
                }
            }

            int totalWage=totalHr*wagePerHr;
            System.out.println("Employee Total Working Days:"+totalDays);
            System.out.println("Employee Total Working Hours:"+totalHr);
            System.out.println("Employee Total Wages:"+totalWage);
        }

}
