/*
 * Problem #136: Single Number
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 10/30/2025, 10:53:53 PM
 * Link: https://leetcode.com/problems/single-number/
 */

class Solution {
    public int singleNumber(int[] nums) {
      int xorr = 0;
      for(int i=0;i<nums.length;i++){
        xorr = xorr ^ nums[i];
      }
      return xorr;
    }
}
