/*
 * Problem #2091: Removing Minimum and Maximum From Array
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 9/7/2026, 2:35:27 PM
 * Link: https://leetcode.com/problems/removing-minimum-and-maximum-from-array/
 */

class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length; 
        int min = 0;
        int max = 0; 
        for(int i = 0; i <n;i++){
            if(nums[i] > nums[max]) max = i;
            if(nums[i] < nums[min] ) min = i;
       
        }
        int left = Math.min(min,max);
        int right = Math.max(min,max);
        
        int front = right+ 1;
        int back = n-left;
        int frontback = (left + 1) + ( n - right);
        return Math.min(front,Math.min(frontback,back));
    }
} 
