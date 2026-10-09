/*
 * Problem #128: Longest Consecutive Sequence
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 7/31/2026, 9:47:53 PM
 * Link: https://leetcode.com/problems/longest-consecutive-sequence/
 */

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int count =1;
        int n = nums.length;
        int maxCount = 1;

        for(int i = 1;i<n;i++){
            if(nums[i] == nums[i-1]) continue;
            if(nums[i] == nums[i-1]+1){
                count += 1;
                maxCount = Math.max(maxCount,count);
            }
            else{
                count =1;
            }
        }
        return maxCount;
    }
}
