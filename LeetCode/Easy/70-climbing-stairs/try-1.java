/*
 * Problem #70: Climbing Stairs
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 2/18/2026, 6:51:06 AM
 * Link: https://leetcode.com/problems/climbing-stairs/
 */

class Solution {
    public int climbStairs(int n) {
        if(n<=1) return 1;
        if(n==2) return 2;

        int temp1 = 1;
        int temp2 = 2;
        int temp3 ;
        temp3= temp1+ temp2;

        for(int i=3;i<n;i++){
            temp1=temp2;
            temp2=temp3;
            temp3= temp1 + temp2;
        }
        return temp3;
    }
}
