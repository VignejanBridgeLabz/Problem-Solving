package org.example.Day9.EmployeeWage;

import org.example.Day8.EmployeeWage.EmployeeWage;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to wage Calculator");
        Employee emp = new Employee();
        emp.checkAttendance();
        emp.dailyWageCalculation();
        emp.employeeMonthlyWageCalculation();
        emp.wageCalculationByParticularRange();

        EmployeeWage empw = new EmployeeWage();
        empw.computeEmployeeWage();

    }
}
