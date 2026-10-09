/*
 * Problem #424: Longest Repeating Character Replacement
 * Difficulty: Medium
 * Submission: Try 5
 * status: Accepted
 * Language: java
 * Date: 9/27/2026, 10:38:58 PM
 * Link: https://leetcode.com/problems/longest-repeating-character-replacement/
 */

class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int maxFreq = 0; int maxLen = 0;
        int left =0; int right =0;

        while(right < s.length()){
            freq[s.charAt(right)- 'A']++;
            maxFreq = Math.max( maxFreq, freq[s.charAt(right)- 'A']);

            while(right-left+1 - maxFreq > k){
                freq[s.charAt(left)- 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right-left+1);
            right++;
        }
        return maxLen;
    }
}
