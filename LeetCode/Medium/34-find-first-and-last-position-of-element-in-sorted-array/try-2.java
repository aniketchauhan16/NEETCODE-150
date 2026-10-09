/*
 * Problem #34: Find First and Last Position of Element in Sorted Array
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 8/20/2026, 2:24:06 PM
 * Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */

class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums,target) , last(nums,target)};
    }

    private int first(int[] nums,int target){
        int ans = -1;
        int n = nums.length;
        int low =0;
        int high =n-1;
        while(low<= high){
            int mid = low + (high-low)/2;

            if(nums[mid] == target){
                ans = mid;
                high = mid-1;
            }
            else if(nums[mid]> target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    private int last(int[] nums,int target){
        int ans = -1;
        int n = nums.length;
        int low =0;
        int high =n-1;
        while(low<= high){
            int mid = low + (high-low)/2;

            if(nums[mid] == target){
                ans = mid;
                low = mid+1;
            }
            else if(nums[mid]> target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}
