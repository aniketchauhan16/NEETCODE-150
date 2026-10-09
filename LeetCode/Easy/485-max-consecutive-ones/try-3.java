/*
 * Problem #485: Max Consecutive Ones
 * Difficulty: Easy
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 11/23/2025, 8:49:29 PM
 * Link: https://leetcode.com/problems/max-consecutive-ones/
 */

class Solution {
  public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max1s = 0;
        for(int i =0; i <nums.length; i++) {
            if (nums[i]==1) {
                count++;
                max1s = Math.max(max1s, count);
            }
            else{
                count = 0;
            }
        }
        return max1s;
            }

    
}
