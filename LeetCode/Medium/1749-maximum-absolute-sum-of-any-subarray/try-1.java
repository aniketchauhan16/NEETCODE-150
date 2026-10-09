/*
 * Problem #1749: Maximum Absolute Sum of Any Subarray
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 8/21/2026, 10:36:03 AM
 * Link: https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray/
 */

class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        int sum = 0;

        for(int i =0;i<n;i++){
            sum += nums[i];
            maxsum = Math.max(maxsum,sum);
            if(sum<0){
                sum =0;
            }
        }
        sum =0;
        for(int i =0;i<n;i++){
            sum+= nums[i];
            minsum = Math.min(minsum,sum) ;
            if(sum>0){
                sum =0;
            }
        }
        return Math.abs(minsum)>maxsum ? Math.abs(minsum) : maxsum; 

    }
}
