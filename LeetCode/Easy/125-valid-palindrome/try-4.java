/*
 * Problem #125: Valid Palindrome
 * Difficulty: Easy
 * Submission: Try 4
 * status: Accepted
 * Language: java
 * Date: 9/23/2026, 4:39:15 AM
 * Link: https://leetcode.com/problems/valid-palindrome/
 */

class Solution {
    public boolean isPalindrome(String s) {
        String cleanText = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i =0; int j = cleanText.length()-1;
        while(i<=j){
            if(cleanText.charAt(i) != cleanText.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}
