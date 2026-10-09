/*
 * Problem #26: Remove Duplicates from Sorted Array
 * Difficulty: Easy
 * Submission: Try 4
 * status: Accepted
 * Language: java
 * Date: 9/16/2026, 10:37:26 PM
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int i =0;
        for(int j = 0;j<nums.length;j++){
            if(nums[j] != nums[i]){
                 nums[i+1] = nums[j];
                i++;}
        }
        return i+1;
    }
}
