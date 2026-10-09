/*
 * Problem #75: Sort Colors
 * Difficulty: Medium
 * Submission: Try 4
 * status: Accepted
 * Language: java
 * Date: 9/16/2026, 11:36:00 AM
 * Link: https://leetcode.com/problems/sort-colors/
 */

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0, j =0,k=n-1;
        while(i<= k){
            if(nums[i] == 2){
                swap(i,k,nums);
                k--;
            }
            else if(nums[i] == 0){
                swap(i,j,nums);
                i++;
                j++;
            }
            else i++;
        }
    }
    private void swap(int i,int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] =temp;
    }
}
