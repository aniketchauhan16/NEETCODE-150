/*
 * Problem #53: Maximum Subarray
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 6/7/2026, 12:03:32 PM
 * Link: https://leetcode.com/problems/maximum-subarray/
 */

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length; int sum = 0; 
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+= nums[i];
            maxsum = Math.max(maxsum,sum);

            if(sum<0){
                sum =0;
            }
        }
        return maxsum;
    }
}
