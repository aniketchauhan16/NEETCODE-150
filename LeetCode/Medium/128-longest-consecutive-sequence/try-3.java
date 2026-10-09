/*
 * Problem #128: Longest Consecutive Sequence
 * Difficulty: Medium
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 8/4/2026, 11:06:02 AM
 * Link: https://leetcode.com/problems/longest-consecutive-sequence/
 */

class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n==0) return 0;
        int maxcount = 1;
            int count = 1;
        for(int i =1;i<n;i++){
            if(nums[i-1] == nums[i]) {continue;}
            else if(nums[i-1] == nums[i]-1){
                count++;
                maxcount = Math.max(maxcount,count);
            }
            else{count = 1;}
        }
        return maxcount;
    }
}
