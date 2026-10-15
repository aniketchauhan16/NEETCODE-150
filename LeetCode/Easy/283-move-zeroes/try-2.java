/*
 * Problem #283: Move Zeroes
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 6/3/2026, 9:25:03 AM
 * Link: https://leetcode.com/problems/move-zeroes/
 */

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int index =0;
        for(int i=0;i<n;i++){
            if(nums[i] != 0){
                temp[index] = nums[i];
                index++;
            }
        }
        for(int i=0;i<n;i++){
        nums[i] = temp[i];
        }
    }
}
