package org.example.Day10.EmployeeWage;

import java.util.Random;
import java.util.Scanner;

public class EmpWageBuilderForUC10 {

    String companyName;
    int maxHrs;
    int maxDays;
    int wagePerHr;
    int totalWage;
    CompanyEmpWage[] companyEmpWages;
    int index=0;

    public EmpWageBuilderForUC10(){}

    public EmpWageBuilderForUC10(String companyName,int maxHrs,int maxDays,int wagePerHr){
        this.companyName=companyName;
        this.maxHrs=maxHrs;
        this.maxDays=maxDays;
        this.wagePerHr=wagePerHr;
    }

    public void checkWage(){
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

    public void add(int size){
        companyEmpWages=new CompanyEmpWage[size];
    }

    public void addCompany(EmpWageBuilderForUC10 emp){
        emp.checkWage();   // compute wage

        companyEmpWages[index]=new CompanyEmpWage(
                emp.companyName,
                emp.maxHrs,
                emp.maxDays,
                emp.wagePerHr,
                emp.totalWage);  // pass total wage

        index++;
    }

    public void display(){
        for(int i=0;i<index;i++){
            System.out.println(companyEmpWages[i]);
        }
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number Companies:");
        int size=sc.nextInt();
        sc.nextLine();

        EmpWageBuilderForUC10 builder=new EmpWageBuilderForUC10();
        builder.add(size);

        for(int i=0;i<size;i++){

            System.out.println("Enter Company Name:");
            String str=sc.nextLine();

            System.out.println("Enter Employee Maximum Working Days:");
            int maxDays=sc.nextInt();

            System.out.println("Enter Employee Maximum Working Hours:");
            int maxHrs=sc.nextInt();

            System.out.println("Enter Wage Per Day:");
            int wagePerDay=sc.nextInt();
            sc.nextLine();

            EmpWageBuilderForUC10 emp=
                    new EmpWageBuilderForUC10(str,maxHrs,maxDays,wagePerDay);

            builder.addCompany(emp);
        }

        builder.display();
    }
}
