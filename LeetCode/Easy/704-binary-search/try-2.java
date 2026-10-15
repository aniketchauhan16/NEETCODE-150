/*
 * Problem #704: Binary Search
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 6/18/2026, 9:55:09 PM
 * Link: https://leetcode.com/problems/binary-search/
 */

class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start =0;
        int end = n-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
