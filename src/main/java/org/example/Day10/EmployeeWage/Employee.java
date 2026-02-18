package org.example.Day10.EmployeeWage;

import java.util.Random;

public class Employee {

        final int wagePerHour =20;
        final int fullDayHour=8;
        final int partTimeHour=8;
        final int daysPerMonth=20;

        Random rand = new Random();
        public void checkAttendance() {
            int n=rand.nextInt(2);
            if (n==0) {
                System.out.println("Employee is Absent");
            }
            else{
                System.out.println("Employee is Present");
            }
        }

        public void  dailyWageCalculation() {
            int toatal=fullDayHour* wagePerHour;
            System.out.println("Full Day Wage is "+toatal);
        }
        public void  employeeMonthlyWageCalculation() {
            int n=rand.nextInt(3);
            int empHR=0;
            switch (n){
                case 1:
                    System.out.println("Full time Employee ");
                    empHR=partTimeHour;
                    break;
                case 2:
                    System.out.println("Part Time Employee");
                    empHR=fullDayHour;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    empHR=0;
                    break;
            }
            int total=empHR* wagePerHour*20;
            System.out.println("Employee Monthly Wage: "+total);
        }

        public void  wageCalculationByParticularRange() {
            int n = rand.nextInt(3);
            int empHR=0;
            switch (n){
                case 1:
                    System.out.println("Full time Employee ");
                    empHR=partTimeHour;
                    break;
                case 2:
                    System.out.println("Part Time Employee");
                    empHR=fullDayHour;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    empHR=0;
                    break;
            }
            int totalHrs=0;
            int totalDays=0;
            int totalWage=0;
            while (totalDays<20&&totalHrs<100) {
                totalDays++;
                totalHrs+=empHR;

            }
            int totalWages=totalHrs*wagePerHour;
            System.out.println("Employee Total Working Days: "+totalDays);
            System.out.println("Employee Total  Working Hours"+totalHrs);
            System.out.println("Employee Total Wages: "+totalWages);
    }

}
