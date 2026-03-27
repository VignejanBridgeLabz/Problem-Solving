package org.example.Day11.AccountManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.println("Enter the amount you want to deposit: ");
        double amount = sc.nextDouble();
        AccountManagement am = new AccountManagement(name, amount);
        am.credit();
       System.out.println("Enter the amount you want to withdraw: ");
       int withdraw = sc.nextInt();
       if(am.debit(withdraw)==-1) return;
        System.out.println("Mr."+name+" Your "+"Balance is now: " + am.getBalance());
    }
}
