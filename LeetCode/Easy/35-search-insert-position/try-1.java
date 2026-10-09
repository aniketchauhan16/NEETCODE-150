/*
 * Problem #35: Search Insert Position
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 11/18/2025, 12:18:15 AM
 * Link: https://leetcode.com/problems/search-insert-position/
 */

class Solution {
    public int searchInsert(int[] nums, int target) {
       
       int n = nums.length;
       int ans =n;
       int low=0,high=n-1;
       while (low<=high) {
        int mid=(high+low)/2;
         if(nums[mid]>=target){
            ans = mid;
            high=mid-1;
        }
        else {
            low=mid+1;
        }
    }return ans;
}
}
