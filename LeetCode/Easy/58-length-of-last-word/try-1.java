/*
 * Problem #58: Length of Last Word
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 8/27/2026, 10:18:05 PM
 * Link: https://leetcode.com/problems/length-of-last-word/
 */

class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int i = n-1;
        int len =0;

        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }
        while(i >=0 && s.charAt(i) != ' '){
            len++;
            i--;
        }
        return len;
    }
}
