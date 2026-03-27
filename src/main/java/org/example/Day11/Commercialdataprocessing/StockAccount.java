package org.example.Day11.Commercialdataprocessing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class StockAccount {

    ArrayList<CompanyShares> clist = new ArrayList<>();
    StockAccount(String filename) {
       try{
           BufferedReader br = new BufferedReader(new FileReader(filename));
           String line;
           while((line = br.readLine()) != null){
               String[] parts = line.split(",");
               String symbol = parts[0];
               int shares = Integer.parseInt(parts[1]);
               double price = Double.parseDouble(parts[2]);
               clist.add(new CompanyShares(symbol, shares, price));
           }
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }

    double valueOf(){
        double totalValue = 0;
        for(CompanyShares companyShares : clist){
        totalValue += companyShares.getShares()*companyShares.getPrice();
        }
        return totalValue;
    }
    void buy(int shares,String symbol){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of the shares: ");
        double price = sc.nextDouble();
        for(CompanyShares companyShare : clist){
             if(companyShare.getSymbol().equals(symbol)){
                 companyShare.shares+=shares;
                 companyShare.price+=price;
                 companyShare.dateTime= LocalDateTime.now();
             }
        }
             clist.add(new CompanyShares(symbol,shares, price));
            System.out.println("Stock are added to the list");
    }
    void sell(int shares,String symbol){
        for(CompanyShares cl : clist){
            if(cl.getSymbol().equals(symbol)){
                if(cl.getShares()>=shares){
                cl.shares-=shares;
                cl.dateTime= LocalDateTime.now();
                    System.out.println("Shares sold");
                }
                else{
                    System.out.println("Sorry, not enough shares");
                }
            }
            else{
                System.out.println("Not found any shares");
                return;
            }
        }
    }

    void save(String filename){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));

            for(CompanyShares cl : clist){
                bw.write(cl.getSymbol()+","+cl.getShares()+","+cl.getPrice()+"\n");
                bw.newLine();
            }
            bw.close();
            System.out.println("Successfully wrote to the file");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    void printReport(){
        System.out.println("Stock Account: ");
        for(CompanyShares cl : clist){
            System.out.println("Symbol: "+cl.getSymbol());
            System.out.println("Shares: "+cl.getShares());
            System.out.println("Price: "+cl.getPrice());
            System.out.println("The last updated "+LocalDateTime.now());
        }
            System.out.println("Total value: "+valueOf());

    }


}
