/*
 * Problem #4083: Minimum Deletions to Make Array Sharp
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 10/18/2026, 9:22:00 AM
 * Link: https://leetcode.com/problems/minimum-deletions-to-make-array-sharp/
 */

class Solution {
    public int minDeletions(int[] nums) {
        int del = 0;
        int lastkept = nums[0];

        for(int i = 1;i<nums.length;i++){
            if(nums[i] == lastkept){
                del++;
            }
        else{
            lastkept = nums[i];
        }
        }
        return del;
    }
}
