/*
 * Problem #2149: Rearrange Array Elements by Sign
 * Difficulty: Medium
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 6/10/2026, 11:13:56 AM
 * Link: https://leetcode.com/problems/rearrange-array-elements-by-sign/
 */

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length; int idx1 =0; int idx2=1;
        int[] result = new int[n];

        for(int i =0; i<n; i++){
            if(nums[i] >= 0 ){
                result[idx1] = nums[i];
                idx1 += 2;
            }
            else{
                result[idx2] = nums[i];
                idx2 += 2;
            }
        }
        return result;
    }
}
