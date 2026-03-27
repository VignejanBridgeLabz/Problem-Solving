package org.example.Day11.StockManagement;

import java.util.ArrayList;

public class StockPortfolio {
    ArrayList<Stock> stocks=new ArrayList<>();

    public void addStock(Stock stock){
        stocks.add(stock);
    }

    public double totalPrice(){
        double totalPrice=0;
        for(Stock stock:stocks){
            totalPrice+=stock.getSharePrice()*stock.getNumberofShares();
        }
        return totalPrice;
    }

    public void displayStocks(){
        for(Stock stock:stocks){
            System.out.println("===STOCK REPORT===");
            System.out.println("Stock Name: "+stock.getStockName());
            System.out.println("Stock Price: "+stock.getSharePrice());
            System.out.println("Number Of Stock Shares: "+stock.getNumberofShares());
            System.out.println("Total Stock Value: "+totalPrice());
         }
    }
}
