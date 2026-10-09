/*
 * Problem #121: Best Time to Buy and Sell Stock
 * Difficulty: Easy
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 7/17/2026, 11:27:40 AM
 * Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length; int bp = Integer.MAX_VALUE; int profit=0; int max_profit = 0;
        for(int i =0; i<n; i++){
            if(prices[i] < bp){
                bp = prices[i];
            }
            else{
                profit = prices[i] - bp;
                max_profit = Math.max(profit,max_profit);
            }
        }
        return max_profit;
    }
}
