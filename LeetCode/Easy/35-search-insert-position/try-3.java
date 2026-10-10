/*
 * Problem #35: Search Insert Position
 * Difficulty: Easy
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 7/24/2026, 6:49:10 AM
 * Link: https://leetcode.com/problems/search-insert-position/
 */

class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low =0; int high = n-1;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(nums[mid] == target){
                return mid;
            }

            else if(nums[mid] >target){
                high = mid-1;
            }
            else{
                low = mid+1;}

        }
        return low;
    }
}
