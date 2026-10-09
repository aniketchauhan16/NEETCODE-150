/*
 * Problem #121: Best Time to Buy and Sell Stock
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 6/10/2026, 10:16:28 AM
 * Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length; int maxProfit =0;
        int bp = Integer.MAX_VALUE;
        for(int i =0; i<n; i++){
            if(bp < prices[i]){
                int profit = prices[i] - bp;
                maxProfit = Math.max(maxProfit,profit);
            }
            else
                bp = prices[i];
        }
        return maxProfit;
        }
    }
