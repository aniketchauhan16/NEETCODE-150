/*
 * Problem #217: Contains Duplicate
 * Difficulty: Easy
 * Submission: Try 4
 * status: Accepted
 * Language: java
 * Date: 8/1/2026, 11:36:54 PM
 * Link: https://leetcode.com/problems/contains-duplicate/
 */

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i =0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1])
            return true;
        }
        return false;
    }
}
