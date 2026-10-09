/*
 * Problem #217: Contains Duplicate
 * Difficulty: Easy
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 7/28/2026, 10:41:19 PM
 * Link: https://leetcode.com/problems/contains-duplicate/
 */

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i] == nums[i+1])
            return true;
        }
        return false;
    }
}
