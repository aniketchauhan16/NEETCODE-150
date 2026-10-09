/*
 * Problem #485: Max Consecutive Ones
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 9/13/2025, 4:46:13 AM
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

    public static void main(String[] args) {
        int nums[] = {1,1,0,1,1,1};
       System.out.println(findMaxConsecutiveOnes(nums)); 
    }
}
