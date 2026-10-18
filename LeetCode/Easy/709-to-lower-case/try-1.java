/*
 * Problem #709: To Lower Case
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 2/19/2026, 6:44:24 PM
 * Link: https://leetcode.com/problems/to-lower-case/
 */

class Solution {
    public String toLowerCase(String s) {
         int index = s.length() - 1;
            return lowerToUpper(s, index);
            
    }
     public static String lowerToUpper(String s, int index) {
            if (index == -1) return "";
            char c = s.charAt(index);
            if (c >= 'A' && c <= 'Z') {
                c = (char)('a' + c - 'A');
            }
            return lowerToUpper(s, index - 1) + c;
        }
}
