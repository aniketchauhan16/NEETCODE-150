/*
 * Problem #153: Find Minimum in Rotated Sorted Array
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 8/21/2026, 6:48:07 AM
 * Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 */

class Solution {
    public int findMin(int[] nums) {
        int low =0; int high = nums.length-1; 

        while(low< high){
            int mid = low + (high-low)/2;

            if(nums[mid] > nums[high]){
                low = mid+1;
            }
                        
            else{
                high = mid;
            }
                    }
        return nums[low];
    }
}
