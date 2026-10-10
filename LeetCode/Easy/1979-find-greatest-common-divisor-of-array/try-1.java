/*
 * Problem #1979: Find Greatest Common Divisor of Array
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 2/18/2026, 11:35:42 PM
 * Link: https://leetcode.com/problems/find-greatest-common-divisor-of-array/
 */

class Solution {
    public int findGCD(int[] nums) {
       int s= Integer.MAX_VALUE;
       int l= Integer.MIN_VALUE;

       for(int i=0;i<nums.length;i++){
        l = Math.max(nums[i], l);
        s = Math.min(nums[i], s);
       }
       return gcdf(l,s);
    }

    public int gcdf(int l,int s){
        if(s==0) return l;  

        return gcdf(s,l%s);
    }
}
