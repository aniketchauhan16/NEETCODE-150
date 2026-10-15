/*
 * Problem #268: Missing Number
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 10/30/2025, 10:33:46 PM
 * Link: https://leetcode.com/problems/missing-number/
 */

class Solution {
    public int missingNumber(int[] nums) {
        
        int n =nums.length; 

        //summation of given arr
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+= nums[i];
        }
        //formula for sum till N

        int s2 = ((n+1)*n)/2;

        int missingnum = s2 - sum;
        return missingnum;

    }
}
