/*
 * Problem #704: Binary Search
 * Difficulty: Easy
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 7/24/2026, 6:37:23 AM
 * Link: https://leetcode.com/problems/binary-search/
 */

class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low =0;
        int high = n-1;

        while(low<= high){
            int mid = low + (high-low)/2;

            if(nums[mid] == target) return mid;

            else if(nums[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
}
