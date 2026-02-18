package org.example.Day10.EmployeeWage;

import java.util.Random;
import java.util.Scanner;

public class EmpWageBuilder {
        String companyName;
        int maxHrs;
        int maxDays;
        int wagePerHr;

        public EmpWageBuilder(String companyName, int maxHrs, int maxDays, int wagePerHr) {
            this.companyName = companyName;
            this.maxHrs = maxHrs;
            this.maxDays = maxDays;
            this.wagePerHr = wagePerHr;
        }

        public void checkWage() {

            int totalHr=0;
            int totalDays=0;
            Random rand=new Random();

            while(totalDays<maxDays && totalHr<maxHrs){

                totalDays++;
                int empHR=0;
                int n=rand.nextInt(3);

                switch(n){
                    case 1:
                        empHR=8;
                        break;

                    case 2:
                        empHR=4;
                        break;

                    default:
                        empHR=0;
                }

                if(totalHr+empHR<=maxHrs){
                    totalHr+=empHR;
                }
            }

            int totalWage=totalHr*wagePerHr;

            System.out.println("Company Name: "+companyName);
            System.out.println("Employee Total Working Days:"+totalDays);
            System.out.println("Employee Total Working Hours:"+totalHr);
            System.out.println("Employee Total Wages:"+totalWage);
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Company Name:");
            String str=sc.nextLine();
            System.out.println("Enter Employee Maximum Working Days:");
            int maxDays=sc.nextInt();
            System.out.println("Enter Employee Maximum Working Hours:");
            int maxHrs=sc.nextInt();
            System.out.println("Enter Wage Per Day:");
            int wagePerDay=sc.nextInt();

            EmpWageBuilder empWageBuilder=new EmpWageBuilder(str,maxHrs,maxDays,wagePerDay);
            empWageBuilder.checkWage();

    }

}
