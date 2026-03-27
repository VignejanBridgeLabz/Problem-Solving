package org.example.Day11.Commercialdataprocessing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StockAccount sa=new StockAccount("src/main/java/org/example/Day11/Commercialdataprocessing/stock.txt");

        while(true){
            System.out.println("1.Buy"+"\n"+"2.Sell"+"\n"+"3.Save"+"\n"+"4.PrintReport"+"\n"+"5.Exit");
            System.out.println("Enter operation you want to perform");
            int operation = sc.nextInt();
            if(operation==1){
                System.out.println("Enter the Symbol");
                String symbol = sc.next();
                System.out.println("Enter the shares:");
                int shares = sc.nextInt();
                sa.buy(shares,symbol);

            }
            else if(operation==2){
                System.out.println("Enter the Symbol");
                String symbol = sc.next();
                System.out.println("Enter the shares:");
                int shares = sc.nextInt();
                sa.sell(shares,symbol);
            }
            else if(operation==3){
                sa.save("src/main/java/org/example/Day11/Commercialdataprocessing/stock.txt");

            }
            else if(operation==4){
                sa.printReport();
            } else if (operation==5) {
                System.out.println("Tank you");
                return;
            }
        }
    }
}
