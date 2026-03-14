package org.example.Day10.EmployeeWage;

public interface EmpWageBuilderUC11 {
    void addCompany(String companyName, int maxHrs, int maxDays, int wagePerHr);
    void calculateWage();
}
