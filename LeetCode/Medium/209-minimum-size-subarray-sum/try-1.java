/*
 * Problem #209: Minimum Size Subarray Sum
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 8/15/2026, 11:51:47 AM
 * Link: https://leetcode.com/problems/minimum-size-subarray-sum/
 */

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left =0; int n = nums.length; int sum = 0;
        int minlen = Integer.MAX_VALUE;
        for(int right = 0; right<n; right ++){
            sum += nums[right];
            while(sum>= target){
                minlen = Math.min(minlen,right-left+1);
                sum -= nums[left];
                left++;
            }
        }
        return (minlen == Integer.MAX_VALUE ? 0 : minlen);
    }
}
