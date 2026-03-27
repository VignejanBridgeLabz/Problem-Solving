package org.example.Day11.StockManagement;


public class Stock{

    String stockName;
    int numberofShares;
    double sharePrice;

    public Stock(String stockName, double sharePrice, int numberofShares) {
        this.stockName = stockName;
        this.sharePrice = sharePrice;
        this.numberofShares = numberofShares;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getNumberofShares() {
        return numberofShares;
    }

    public void setNumberofShares(int numberofShares) {
        this.numberofShares = numberofShares;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }
}
