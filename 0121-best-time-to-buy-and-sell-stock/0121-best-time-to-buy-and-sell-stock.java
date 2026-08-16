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