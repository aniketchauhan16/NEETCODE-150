/*
 * Problem #121: Best Time to Buy and Sell Stock
 * Difficulty: Easy
 * Submission: Try 5
 * status: Accepted
 * Language: java
 * Date: 9/29/2026, 10:01:26 PM
 * Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */

class Solution {
    public int maxProfit(int[] prices) {
        int bp = Integer.MAX_VALUE;
        int maxProfit =0;
        for(int i =0;i<prices.length;i++){
            if(prices[i] < bp){
                bp = prices[i];
            }
            else{
                int profit = prices[i]-bp;
                maxProfit = Math.max(maxProfit,profit);
            }
        }
        return maxProfit;
    }
}
