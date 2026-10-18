/*
 * Problem #3870: Count Commas in Range
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 9/8/2026, 9:27:43 PM
 * Link: https://leetcode.com/problems/count-commas-in-range/
 */

class Solution {
    public int countCommas(int n) {
        return (n >=1000) ? n-999 : 0; 
    }
}
