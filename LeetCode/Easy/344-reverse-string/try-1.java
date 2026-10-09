/*
 * Problem #344: Reverse String
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 2/19/2026, 7:00:41 AM
 * Link: https://leetcode.com/problems/reverse-string/
 */

class Solution {
    public static void reverseString(char[] s) {
        int start = 0; int end = s.length - 1;
        reversetheString(s, start, end);
        System.out.println(new String(s));
    }

    public static void reversetheString(char[] s, int start, int end) {
        if (start >= end) {
            return;
        }
        char x = s[start];
        s[start] = s[end];
        s[end] = x;
        reversetheString(s, start + 1, end - 1);
    }
}
