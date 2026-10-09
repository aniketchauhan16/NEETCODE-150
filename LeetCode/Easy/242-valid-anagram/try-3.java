/*
 * Problem #242: Valid Anagram
 * Difficulty: Easy
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 7/29/2026, 6:55:42 AM
 * Link: https://leetcode.com/problems/valid-anagram/
 */

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        int[] nums = new int[26];
        for(int i =0;i<s.length();i++){
            nums[s.charAt(i)-'a']++;
            nums[t.charAt(i)-'a']--;
        }

        for(int num:nums){
            if (num != 0) return false;
        }
        return true;
    }
}
