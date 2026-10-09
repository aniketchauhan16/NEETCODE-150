/*
 * Problem #121: Best Time to Buy and Sell Stock
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 9/11/2025, 9:15:47 PM
 * Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */

class Solution {
     public int maxProfit(int[] prices) {
            int buyprice = Integer.MAX_VALUE;
            int maxprofit = 0;
            for(int i=0;i<prices.length;i++) {
                if (buyprice < prices[i]) {
                    int profit = prices[i] - buyprice;
                    maxprofit = Math.max(maxprofit, profit);                    
                }
                else {
                    buyprice = prices[i];
                }
            }
        return maxprofit;
        }


    public void main(String[] args) {
        int prices[] = {};
        System.out.println(maxProfit(prices));
    }
    
}
