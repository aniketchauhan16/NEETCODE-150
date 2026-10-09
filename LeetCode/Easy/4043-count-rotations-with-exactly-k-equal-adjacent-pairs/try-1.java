/*
 * Problem #4043: Count Rotations With Exactly K Equal Adjacent Pairs
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 9/6/2026, 9:12:54 AM
 * Link: https://leetcode.com/problems/count-rotations-with-exactly-k-equal-adjacent-pairs/
 */

class Solution {
    public int countRotations(String s, int k) {
        int n = s.length();
        int validrot = 0;

        for(int start = 0;start<n;start++){
            int score = 0;
            for(int j = 0;j<n-1;j++){
                char curr = s.charAt((start+j)%n);
                char next = s.charAt((start+j+1)%n);
                if(curr == next) score++;
            }
            if(score == k){
                validrot++;
            }
        }
        return validrot;
    }
}
