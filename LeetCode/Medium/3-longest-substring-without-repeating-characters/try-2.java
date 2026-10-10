/*
 * Problem #3: Longest Substring Without Repeating Characters
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 9/16/2026, 11:22:00 PM
 * Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0; int maxLen = 0;
        HashSet<Character> hs = new HashSet<>();
        for(int right = 0;right<s.length();right++){
            Character ch = s.charAt(right);

            while(hs.contains(ch)){
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(ch);
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}
