/*
 * Problem #26: Remove Duplicates from Sorted Array
 * Difficulty: Easy
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 6/3/2026, 6:53:16 AM
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int i =0;
        for(int j=0; j<nums.length ; j++){
            if(nums[j] != nums[i]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
}
