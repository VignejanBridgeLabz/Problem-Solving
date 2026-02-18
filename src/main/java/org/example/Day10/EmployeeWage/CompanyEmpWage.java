package org.example.Day10.EmployeeWage;

import java.util.Random;
import java.util.Scanner;

public class CompanyEmpWage {
        String companyName;
        int maxHrs;
        int maxDays;
        int wagePerHr;
        int totalSalary;
    public CompanyEmpWage(String companyName, int maxHrs, int maxDays, int wagePerHr, int totalSalary) {
        this.companyName = companyName;
        this.maxHrs = maxHrs;
        this.maxDays = maxDays;
        this.wagePerHr = wagePerHr;
        this.totalSalary = totalSalary;
    }
    public void setTotalSalary(int totalSalary){
        this.totalSalary = totalSalary;
    }
    public String toString(){
        return (companyName+" for Total Salary: "+totalSalary);
    }
}