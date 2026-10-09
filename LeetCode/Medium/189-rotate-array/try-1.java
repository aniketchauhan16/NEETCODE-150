/*
 * Problem #189: Rotate Array
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 3/16/2026, 3:50:49 PM
 * Link: https://leetcode.com/problems/rotate-array/
 */

class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[(i+k)%nums.length]= (nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        
    }
}
