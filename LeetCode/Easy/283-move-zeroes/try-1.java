/*
 * Problem #283: Move Zeroes
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 3/17/2026, 2:26:56 PM
 * Link: https://leetcode.com/problems/move-zeroes/
 */

class Solution {
    public void moveZeroes(int[] nums) {
       int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0) nums[i++] = nums[j];
        }
        while(i<nums.length)
            nums[i++] = 0;
    }
}
