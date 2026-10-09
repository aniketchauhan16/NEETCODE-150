/*
 * Problem #42: Trapping Rain Water
 * Difficulty: Hard
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 8/13/2026, 8:29:58 PM
 * Link: https://leetcode.com/problems/trapping-rain-water/
 */

class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left =0;int right = n-1;
        int sum = 0;
        int left_max = 0; int right_max = 0;

        while(left<right){
            if(height[left] <= height[right]){
                if( height[left] < left_max ){
                    sum += left_max - height[left];
                    left++;
                }
                else{
                    left_max = height[left];
                    left++;
                }
            }
            else{
                if(height[right]<right_max){
                    sum+= right_max -height[right];
                    right--;
                }
                else{
                    right_max = height[right];
                    right--;
                }
            }
        }
        return sum;
    }
}
