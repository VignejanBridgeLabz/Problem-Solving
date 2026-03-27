package org.example.Day11.Commercialdataprocessing;

import java.time.LocalDateTime;

public class CompanyShares {
    String symbol;
    int shares;
    double price;
    LocalDateTime dateTime;

    public CompanyShares(String symbol, int shares, double price) {
        this.symbol = symbol;
        this.shares = shares;
        this.price = price;
        this.dateTime = LocalDateTime.now();
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getShares() {
        return shares;
    }

    public double getPrice() {
        return price;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }


}
