/*
 * Problem #26: Remove Duplicates from Sorted Array
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 10/2/2025, 12:11:52 AM
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=0;
        for(int j=0;j<n;j++){
            if(nums[j] != nums[i]){
                i++;
            nums[i] = nums[j];
            }
        } return i+1;
    }
}
