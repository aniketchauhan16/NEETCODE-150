/*
 * Problem #4078: Three Fibonacci Sum
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 10/11/2026, 9:27:31 AM
 * Link: https://leetcode.com/problems/three-fibonacci-sum/
 */

class Solution {
    public boolean threeFibonacciSum(int n) {
        int x = 0, y = 1;

        while (true) {
            int z = x + y;

            if (x + y + z == n) {
                return true;
            }

            if (x + y + z > n) {
                return false;
            }

            x = y;
            y = z;
        }
    }
}
