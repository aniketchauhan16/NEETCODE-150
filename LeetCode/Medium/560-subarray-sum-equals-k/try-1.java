/*
 * Problem #560: Subarray Sum Equals K
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 11/16/2025, 11:11:43 PM
 * Link: https://leetcode.com/problems/subarray-sum-equals-k/
 */

class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int cnt =0;
        for (int i=0;i<n;i++){
            int sum =0;
            for(int j=i;j<n;j++){
                sum += nums[j];
                if (sum==k) {
                    cnt++;
                }
            }
        } 
        return cnt;
    }
}
