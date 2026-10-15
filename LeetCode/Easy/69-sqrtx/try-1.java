/*
 * Problem #69: Sqrt(x)
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 8/20/2026, 11:06:53 PM
 * Link: https://leetcode.com/problems/sqrtx/
 */

class Solution {
    public int mySqrt(int x) {
        int low =0;int high = x;
        int res =0;

        while(low<= high){
            int mid = low + (high-low)/2;

            if((long) mid*mid < x){
                res = mid;
                low = mid+1;
            }
            else if((long) mid*mid > x){
                high = mid-1;
            }
            else{
                return mid;
            }
        }
        return res;
    }
}
