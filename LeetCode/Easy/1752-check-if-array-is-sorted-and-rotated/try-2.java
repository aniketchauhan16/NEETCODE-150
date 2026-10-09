/*
 * Problem #1752: Check if Array Is Sorted and Rotated
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 6/3/2026, 6:42:59 AM
 * Link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
 */

class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int counter = 0;
        for(int i=0;i<n;i++){
            if(nums[(i+1)%n] < nums[i])
                counter++;    
        }
        if(counter <= 1)
            return true;
        return false;
    }
}
