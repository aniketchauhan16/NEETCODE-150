/*
 * Problem #81: Search in Rotated Sorted Array II
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 8/21/2026, 12:06:24 AM
 * Link: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
 */

class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low =  0; int high = n-1;

        while(low<= high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[low] < nums[mid] ){
                if(nums[mid] > target && nums[low] <= target){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            } 
            else if(nums[low] > nums[mid]){
                if(target > nums[mid] && target <= nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
            else{
                low++;
            }
        } 
        return false;
    }
}
