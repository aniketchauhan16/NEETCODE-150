/*
 * Problem #1929: Concatenation of Array
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 11/23/2025, 8:23:41 PM
 * Link: https://leetcode.com/problems/concatenation-of-array/
 */

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int arr[] = new int[2*n];
            for(int i=0;i<n;i++){
                 arr[i]=nums[i];
                arr[n+i] = nums[i];
            }
              
    
    return arr;}
} 
