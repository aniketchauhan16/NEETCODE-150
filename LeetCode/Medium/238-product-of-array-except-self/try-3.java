/*
 * Problem #238: Product of Array Except Self
 * Difficulty: Medium
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 8/4/2026, 10:13:02 AM
 * Link: https://leetcode.com/problems/product-of-array-except-self/
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n]; left[0] = 1;
        int[] right = new int[n]; right[n-1] = 1;
        int[] arr = new int[n];
        int pro = 1;
        for(int i=1;i<n;i++){
            pro *= nums[i-1];
            left[i] = pro; 
        }
        pro = 1;
        for(int i = n-2;i>=0;i--){
            pro*= nums[i+1];
            right[i] =  pro;
        }

        for(int i=0;i<n;i++){
            arr[i] = left[i]*right[i];
        }
        return arr;
        }
    }

