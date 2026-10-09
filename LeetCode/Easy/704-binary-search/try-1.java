/*
 * Problem #704: Binary Search
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 9/13/2025, 7:18:54 PM
 * Link: https://leetcode.com/problems/binary-search/
 */

class Solution {
    public  int search(int[] nums, int target) { 
        int start = 0;
        int end = nums.length-1;
        
        while (start<=end) {
            int mid = (start + end)/2;
            if (nums[mid] > target) {
                end = mid-1;
            }
            else if (nums[mid] < target) {
                start = mid+1;
            }
            else if (nums[mid] == target) {
                return mid;
           }
        
    } 
    return -1;
}
}
