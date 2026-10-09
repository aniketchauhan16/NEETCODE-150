/*
 * Problem #977: Squares of a Sorted Array
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 6/3/2026, 10:40:02 AM
 * Link: https://leetcode.com/problems/squares-of-a-sorted-array/
 */

class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i =0;i<nums.length;i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
