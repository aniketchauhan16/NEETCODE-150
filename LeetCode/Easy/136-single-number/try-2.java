/*
 * Problem #136: Single Number
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 6/4/2026, 11:50:26 AM
 * Link: https://leetcode.com/problems/single-number/
 */

class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
      for(int i=0;i<n;i++){
        int counter = 0;
        for(int j=0;j<n;j++){
            if(nums[i] == nums[j])
                counter++;    
        }
        if(counter ==1){
            return nums[i]; }
        }
        return -1;
    }

}
