/*
 * Problem #151: Reverse Words in a String
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 8/21/2026, 12:05:56 PM
 * Link: https://leetcode.com/problems/reverse-words-in-a-string/
 */

class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        int left =0;
        int right = words.length-1;
        while(left<right){
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++; right--;
        }
        return String.join(" ",words);
    }
}
