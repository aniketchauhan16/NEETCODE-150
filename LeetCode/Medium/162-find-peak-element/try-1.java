/*
 * Problem #162: Find Peak Element
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 8/20/2026, 10:35:08 PM
 * Link: https://leetcode.com/problems/find-peak-element/
 */

class Solution {
    public int findPeakElement(int[] nums) {
        int low =0;
        int high = nums.length-1;

        while(low<= high){
            int mid = low + (high-low)/2;

            if(mid>0 && nums[mid] <nums[mid-1]){
                high = mid-1;
            }
            else if (mid < nums.length-1 && nums[mid] < nums[mid+1]){
                low = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
