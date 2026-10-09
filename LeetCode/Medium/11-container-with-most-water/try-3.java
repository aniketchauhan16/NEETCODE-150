/*
 * Problem #11: Container With Most Water
 * Difficulty: Medium
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 10/1/2026, 11:43:11 AM
 * Link: https://leetcode.com/problems/container-with-most-water/
 */

class Solution {
    public int maxArea(int[] height) {
        int n = height.length; int left = 0; int right = n-1;
        int maxsum = -1;
        while(left < right){
            int sum = (right-left)* Math.min(height[left],height[right]);
            maxsum = Math.max(sum,maxsum);
            if(height[left] < height[right]) left++;
            else right--;
        }
        return maxsum;
    }
}
