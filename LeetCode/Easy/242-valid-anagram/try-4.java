/*
 * Problem #242: Valid Anagram
 * Difficulty: Easy
 * Submission: Try 4
 * status: Accepted
 * Language: java
 * Date: 8/1/2026, 11:52:30 PM
 * Link: https://leetcode.com/problems/valid-anagram/
 */

class Solution {
    public boolean isAnagram(String s, String t) {
        if( s.length() != t.length()) return false;
        int[] arr = new int[26]; 
        
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int num : arr){
            if(num != 0){
                return false;
            }
        }
        return true;
    }
}
