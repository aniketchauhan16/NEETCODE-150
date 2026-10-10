/*
 * Problem #11: Container With Most Water
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 8/13/2026, 11:31:02 AM
 * Link: https://leetcode.com/problems/container-with-most-water/
 */

class Solution {
    public int maxArea(int[] height) {
        int l = 0; int r = height.length-1;
        int maxsum= -1;
        
        while(l<r){
            int sum = (r-l) * Math.min(height[r],height[l]);
            maxsum = Math.max(maxsum,sum);
            if(height[l]< height[r]) l++;
            else{ r--;}
        }
        return maxsum;
    }
}
