/*
 * Problem #875: Koko Eating Bananas
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 8/24/2026, 5:58:41 AM
 * Link: https://leetcode.com/problems/koko-eating-bananas/
 */

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int l =0;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = r;

        while(l<=r){
            int k = l+(r-l)/2;
            int totalTime = 0;
            for(int p : piles){
                totalTime += Math.ceil((double)p/k);
            }
            if(totalTime<= h){
                res = k;
                r = k-1; 
            }
            else{
                l=k+1;}
        }
        return res;
    }
}
