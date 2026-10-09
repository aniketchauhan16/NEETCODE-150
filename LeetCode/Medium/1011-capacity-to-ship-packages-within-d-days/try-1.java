/*
 * Problem #1011: Capacity To Ship Packages Within D Days
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 8/25/2026, 5:45:10 AM
 * Link: https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
 */

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0; int r =0;
        for(int w:weights){
            l = Math.max(l,w);
            r+= w;
        }
    
        while(l<r){
         int mid = l+(r-l)/2;

         int needed = daysNeeded(weights,mid);
         if(needed <= days){
            r = mid;
         }
         else{
            l = mid+1;
         }
        }
        return l;
    }

        private int daysNeeded(int[] weights,int capacity){
            int currLoad = 0; int days =1;
            for(int w:weights){
                if(currLoad + w > capacity){
                    days++;
                    currLoad = w;
                }
                else{
                    currLoad += w;
                }
            }
            return days;
        }
}
