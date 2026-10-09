/*
 * Problem #2149: Rearrange Array Elements by Sign
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 6/10/2026, 11:03:26 AM
 * Link: https://leetcode.com/problems/rearrange-array-elements-by-sign/
 */

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] nums1 = new int[n];  int index1 = 0;
        int[] nums2 = new int[n];  int index2 = 0;
        
        for(int i=0; i<n; i++){
            if(nums[i] >= 0){
                nums1[index1++] = nums[i];}
            else 
                nums2[index2++] = nums[i];
        }
        for(int i =0;i<n/2;i++){
            nums[2*i] = nums1[i];
            nums[(2*i)+1] = nums2[i];
        }
        return nums;
        }
    }
