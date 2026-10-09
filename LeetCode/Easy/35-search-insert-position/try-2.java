/*
 * Problem #35: Search Insert Position
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 6/19/2026, 11:10:20 PM
 * Link: https://leetcode.com/problems/search-insert-position/
 */

class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int start =0;
        int end = n-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return start;
    }
}
