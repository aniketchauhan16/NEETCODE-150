/*
 * Problem #283: Move Zeroes
 * Difficulty: Easy
 * Submission: Try 5
 * status: Accepted
 * Language: java
 * Date: 10/3/2026, 11:15:13 PM
 * Link: https://leetcode.com/problems/move-zeroes/
 */

class Solution {
    public void moveZeroes(int[] nums) {
    int j = 0;int n = nums.length;

    for(int i=0;i<n;i++){
        if(nums[i] != 0){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        j++;
        }
    }
    
    }

}
    
