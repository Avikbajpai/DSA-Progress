package org.example.Problems;

public class BestTimeBuySellStock {

    public int maxProfit(int[] prices) {
        int i,j;
        int n = prices.length;
        int buy =0;
        int sell = 0;
        int profit = 0;
        int rightMax = 0;
        int[] rightMaxArray = new int[n];

        for(i = n-1; i >=0; i--){
            rightMax = Math.max(rightMax, prices[i]);
            rightMaxArray[i] = rightMax;
        }

        for(j = 0; j < n; j++){
            buy = prices[j];
            sell = rightMaxArray[j];

            if((sell - buy) > profit){
                profit = Math.max(profit, sell - buy);
            }
        }
        System.out.println(profit);
        return profit;
    }
}
