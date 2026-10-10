/*
 * Problem #922: Sort Array By Parity II
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 6/16/2026, 10:53:14 PM
 * Link: https://leetcode.com/problems/sort-array-by-parity-ii/
 */

class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int indexe = 0;
        int indexo =1;
        for(int i =0;i<n;i++){
            if(nums[i]%2 == 0){
                ans[indexe] = nums[i];
                indexe+=2;
            }
            else{
                ans[indexo] = nums[i];
                indexo += 2;
            }
        }
        return ans;
    }
}
