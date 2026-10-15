/*
 * Problem #75: Sort Colors
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 11/4/2025, 4:41:37 AM
 * Link: https://leetcode.com/problems/sort-colors/
 */

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0,mid = 0,high = n-1;
        while (mid<=high) {
            if (nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++; mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}
