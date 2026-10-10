/*
 * Problem #53: Maximum Subarray
 * Difficulty: Medium
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 7/17/2026, 10:09:26 AM
 * Link: https://leetcode.com/problems/maximum-subarray/
 */

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        int n = nums.length;

         for(int i =0;i<n;i++){
            sum += nums[i];
            
            maxsum = Math.max(sum,maxsum);
            if(sum < 0 )
            sum = 0;
            
        }
        return maxsum;}
    
}
