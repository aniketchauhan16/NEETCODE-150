/*
 * Problem #1365: How Many Numbers Are Smaller Than the Current Number
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 11/26/2025, 9:23:32 PM
 * Link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 */

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int arr[] = new int [n]; 
       
        for(int i=0;i<n;i++){
             int count =0;
            for(int j=0;j<n;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            } arr[i] = count;
        }
    return arr;}
}
