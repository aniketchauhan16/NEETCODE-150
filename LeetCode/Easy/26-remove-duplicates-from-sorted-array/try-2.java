/*
 * Problem #26: Remove Duplicates from Sorted Array
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 6/1/2026, 11:05:25 PM
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i =1;i<nums.length;i++){
            if(nums[j] != nums[i]){
                nums[j+1] = nums[i];
                j++;
            }
        }
        return j+1;
    }
}
