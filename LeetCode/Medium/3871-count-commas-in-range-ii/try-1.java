/*
 * Problem #3871: Count Commas in Range II
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 9/9/2026, 7:24:24 AM
 * Link: https://leetcode.com/problems/count-commas-in-range-ii/
 */

class Solution {
    public long countCommas(long n) {
        long ans = 0;
        for(long threshold = 1000;threshold <= n;threshold*= 1000){
            ans += (n-threshold +1);
        }
        return ans;
    }
}
