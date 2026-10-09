/*
 * Problem #53: Maximum Subarray
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 9/9/2025, 10:48:12 PM
 * Link: https://leetcode.com/problems/maximum-subarray/
 */

class Solution {
    public static int maxSubArray(int[] nums) {
        int ms = nums[0];
        int cs = nums[0];
        for(int i =1;i<nums.length;i++) { 
            cs = Math.max(nums[i] ,cs + nums[i] );
            ms = Math.max(cs, ms);
        }
        return ms;
        
    }
    public static void main(String[] args) {
        int nums[] = {};
        System.out.println(maxSubArray(nums));

    }
}
