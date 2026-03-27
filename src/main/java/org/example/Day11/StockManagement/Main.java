package org.example.Day11.StockManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of stock have you want to store");
        int n=sc.nextInt();
        sc.nextLine();
        StockPortfolio stockPortfolio=new StockPortfolio();
        for(int i=1;i<=n;i++){
        System.out.println("Enter the name of the stock No : "+i);
        String stockName = sc.nextLine();
        System.out.println("Enter the number of shares");
        int numberofShares = sc.nextInt();
        System.out.println("Enter the share price");
        double sharePrice = sc.nextDouble();
        sc.nextLine();
        Stock stock = new Stock(stockName, sharePrice, numberofShares);

        stockPortfolio.addStock(stock);
        }
        stockPortfolio.displayStocks();
    }
}
