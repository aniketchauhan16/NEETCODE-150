/*
 * Problem #33: Search in Rotated Sorted Array
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 4/3/2026, 7:18:16 AM
 * Link: https://leetcode.com/problems/search-in-rotated-sorted-array/
 */

class Solution {
    public int search(int[] nums, int target) {
        int low =0,n = nums.length,high = n-1;
        while(low<= high) {
            int mid = low + (high-low)/2;

            if(nums[mid] == target ){
                return mid;
            }

             if(nums[low] <= nums[mid]){
                if(nums[low] <= target && nums[mid] > target ){
                    high = mid-1;
                }
                else {
                    low = mid+1;
                }
            }

            else{
                if(nums[mid] < target && nums[high] >= target){
                    low = mid+1;
                }
                else {
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}
