package org.example.Day10.EmployeeWage;


import org.example.Day10.EmployeeWage.Employee;

public class Main {
        public static void main(String[] args) {
            System.out.println("Welcome to wage Calculator");
            Employee emp = new Employee();
            emp.checkAttendance();
            emp.dailyWageCalculation();
            emp.employeeMonthlyWageCalculation();
            emp.wageCalculationByParticularRange();

            EmployeeWageCalculation empw = new EmployeeWageCalculation();
            empw.wageComputation();


    }

}
