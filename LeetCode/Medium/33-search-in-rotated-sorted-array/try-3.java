/*
 * Problem #33: Search in Rotated Sorted Array
 * Difficulty: Medium
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 7/3/2026, 10:17:53 AM
 * Link: https://leetcode.com/problems/search-in-rotated-sorted-array/
 */

class Solution {
    public int search(int[] nums, int target) {
      int n = nums.length;  int low = 0; int high = n-1;

      while(low<= high){

        int mid = low +(high-low)/2;
            if(nums[mid] == target) return mid;
        if(nums[low] <= nums[mid]){
            if(target >= nums[low] && target <= nums[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        else{
            if(target >= nums[mid] && target <= nums[high]){
                low = mid+1;
            }
            else{high = mid - 1;}
        }
      }
      return -1;
    }
}
