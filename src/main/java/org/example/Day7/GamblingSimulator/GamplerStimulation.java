package org.example.Day7.GamblingSimulator;

import java.util.*;

public class GamplerStimulation {

//    Use Case
    static final int stake=100;
    static final int bet=1;
    static final int days =20;

    Random rand=new Random();
    public void PlayforDays(){
        int totalAmount=0;
        int winningDays=0;
        int lossingDays=0;

        ArrayList<Integer> dailyResultsAr =new ArrayList<Integer>();

        int min=0,max=0;
        for(int i=1;i<=days;i++){
            int stak=stake;
            while(stak>50 && stak<150){
            boolean win=rand.nextBoolean();
                if(win){
                    stak+=bet;
                }
                else{
                    stak-=bet;
                }
            }
            int dailyResult=stak-stake;
            dailyResultsAr.add(dailyResult);
            totalAmount+=dailyResult;

            if(dailyResult>0){
                winningDays++;

            }
            else{
                lossingDays++;

            }
            System.out.println("The Day "+i+" ended with stake is: $"+stak);
        }
//        System.out.println("list"+ winningList);
//        Map<String, List<Integer>> resultMap =new HashMap<>();
//        resultMap.put("winning",winningList);
//        resultMap.put("lossing",lossingList);

        // -------- Find luckiest & unluckiest day --------
        int maxWin = Collections.max(dailyResultsAr);
        int maxLoss = Collections.min(dailyResultsAr);

        int luckiestDay = dailyResultsAr.indexOf(maxWin) + 1;
        int unluckiestDay = dailyResultsAr.indexOf(maxLoss) + 1;

        System.out.println("Monthly Details...");
            System.out.println("Winning days: "+winningDays);
            System.out.println("Lost days: "+lossingDays);
            System.out.println("Total amount: $"+totalAmount);
        System.out.println();

        System.out.println("The Luckiest and Unluckiest Days.....");
        System.out.println("\nLuckiest Day: Day " + luckiestDay +
                " (Won $" + maxWin + ")");

        System.out.println("Unluckiest Day: Day " + unluckiestDay +
                " (Lost $" + Math.abs(maxLoss) + ")");
    }

}
