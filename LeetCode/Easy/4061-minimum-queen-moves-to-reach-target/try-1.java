/*
 * Problem #4061: Minimum Queen Moves to Reach Target
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 9/26/2026, 9:26:06 PM
 * Link: https://leetcode.com/problems/minimum-queen-moves-to-reach-target/
 */

class Solution {
    public int minQueenMoves(int[] source, int[] target) {
        int sr = source[0]; int sc = source[1];
        int tr = target[0]; int tc = target[1];

        if (sr == tr && sc == tc) {
            return 0;
        }

        
        if (sr == tr || sc == tc || Math.abs(sr - tr) == Math.abs(sc - tc)) {
            return 1;
        }
        return 2;
    }
}
