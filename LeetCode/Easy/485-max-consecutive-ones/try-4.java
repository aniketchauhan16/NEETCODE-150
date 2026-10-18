/*
 * Problem #485: Max Consecutive Ones
 * Difficulty: Easy
 * Submission: Try 4
 * status: Accepted
 * Language: java
 * Date: 6/4/2026, 9:53:27 AM
 * Link: https://leetcode.com/problems/max-consecutive-ones/
 */

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length; int counter =0; int max =0;

        for(int i=0;i<n;i++){
            if(nums[i] == 1){
              counter++;
            max = Math.max(counter,max);
                                      }
            else{
                counter = 0;
            }
        } return max;
    }
}
