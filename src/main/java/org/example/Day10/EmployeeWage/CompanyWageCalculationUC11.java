package org.example.Day10.EmployeeWage;

import java.util.Random;
import java.util.Scanner;

public class CompanyWageCalculationUC11 implements EmpWageBuilderUC11 {

    String companyName;
    int maxHrs;
    int maxDays;
    int wagePerHr;
    int totalWage;
    CompanyEmpWage[] companyEmpWages;
    int index = 0;


    @Override
    public void addCompany(String companyName, int maxHrs, int maxDays, int wagePerHr) {
        calculateWage();
        companyEmpWages[index]=new CompanyEmpWage(
                    companyName,maxHrs,maxDays,wagePerHr
            );
            index++;
    }


    @Override
    public void calculateWage() {
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

            totalWage=totalHr*wagePerHr;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CompanyWageCalculationUC11 cmp=new CompanyWageCalculationUC11();
        System.out.println("Enter the number of Company:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
        System.out.println("Enter Company Name:");
        String companyName=sc.nextLine();
        System.out.println("Enter Employee Maximum Working Days:");
        int maxDays=sc.nextInt();
        System.out.println("Enter Employee Maximum Working Hours:");
        int maxHrs=sc.nextInt();
        System.out.println("Enter Wage Per Day:");
        int wagePerDay=sc.nextInt();
        sc.nextLine();
        CompanyWageCalculationUC11 emp1=new CompanyWageCalculationUC11();
        emp1.addCompany(companyName,maxHrs,maxDays,wagePerDay);
        }
    }
}
