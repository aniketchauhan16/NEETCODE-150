/*
 * Problem #905: Sort Array By Parity
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 8/21/2026, 11:24:11 AM
 * Link: https://leetcode.com/problems/sort-array-by-parity/
 */

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;int j=0;
      for(int i =0;i<n;i++){
        if(nums[i]%2 == 0){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j++;
        }
      }
        return nums;
    }
}
