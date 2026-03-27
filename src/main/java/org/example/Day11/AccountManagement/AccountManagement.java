package org.example.Day11.AccountManagement;

public class AccountManagement {
    String name;
    double amount;
    double balance;

    public AccountManagement(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void credit() {
        if(amount >0) {
            this.balance += amount;
        }
        else {
            System.out.println("Amount is negative");
        }
    }
    double debit(int dbamount) {
        if (dbamount <= balance) {
            this.balance -= dbamount;
        }
        else {
            System.out.println("Debit amount exceeded account balance.");
            return -1;
        }
        return balance;
    }
}
