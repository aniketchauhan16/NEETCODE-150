/*
 * Problem #122: Best Time to Buy and Sell Stock II
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 7/17/2026, 12:42:42 PM
 * Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length; int totalprofit = 0;

        for(int i =1;i<n; i++){
            int dailyprofit = prices[i] - prices[i-1];
            totalprofit += Math.max(0, dailyprofit);
        }
        return totalprofit;
    }
}
