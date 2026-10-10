/*
 * Problem #75: Sort Colors
 * Difficulty: Medium
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 8/21/2026, 10:56:56 AM
 * Link: https://leetcode.com/problems/sort-colors/
 */

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;int j =0; int k=n-1; int i =0;

        while(i<=k){
            if(nums[i] == 2){
                swap(i,k,nums);
                k--;
            }
            else if(nums[i]== 0){
                swap(i,j,nums);
                j++;
                i++;
            }
            else{
                i++;
            }
        }
    }
    private void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
