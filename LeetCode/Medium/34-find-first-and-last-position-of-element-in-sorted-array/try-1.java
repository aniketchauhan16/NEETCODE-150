/*
 * Problem #34: Find First and Last Position of Element in Sorted Array
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 6/20/2026, 12:07:50 AM
 * Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */

class Solution {
    public int[] searchRange(int[] nums, int target) {
           return new int[] {first(nums, target )  , last(nums , target)};
    }
        private int first(int[] nums,int target){
        int start = 0;
        int n = nums.length;
        int end = n-1;
        int ans = -1;
        while(start<= end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                ans = mid;
                end = mid-1;
            }
            else if(nums[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
        }

         private int last(int[] nums,int target){
        int start = 0;
        int n = nums.length;
        int end = n-1;
        int ans = -1;
        while(start<= end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                ans = mid;
                start = mid+1;
            }
            else if(nums[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
        }  
}
