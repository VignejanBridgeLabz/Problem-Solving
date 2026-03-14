package org.example.Day10.EmployeeWage;

import java.util.Random;

public class CimpanyWageCalculationUC11 implements EmpWageBuilderUC11 {

    String companyName;
    int maxHrs;
    int maxDays;
    int wagePerHr;
    int totalWage;
    CompanyEmpWage[] companyEmpWages;
    int index = 0;


    @Override
    public void addCompany(String companyName, int maxHrs, int maxDays, int wagePerHr,int totalWages) {
            companyEmpWages[index]=new CompanyEmpWage(
                    companyName,maxHrs,maxDays,wagePerHr,totalWages
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
}
