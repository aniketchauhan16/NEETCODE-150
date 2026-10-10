/*
 * Problem #1752: Check if Array Is Sorted and Rotated
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 9/11/2025, 10:59:12 PM
 * Link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
 */

class Solution {
    public Boolean check(int[] nums ) {
        int count = 0;
        int n = nums.length;

        for(int i =0;i<n;i++) {
            if(nums[i] > nums[(i+1) % n]) {
                count++;
                if(count > 1){
                    return false;}
            }
        }
        return true;
    }
} 
