/*
 * Problem #1470: Shuffle the Array
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 11/23/2025, 8:48:25 PM
 * Link: https://leetcode.com/problems/shuffle-the-array/
 */

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[n*2];
        for(int i=0;i<n;i++){
            arr[2*i]= nums[i];
            arr[2*i+1]= nums[n+i];
        }
   return arr; }
}
