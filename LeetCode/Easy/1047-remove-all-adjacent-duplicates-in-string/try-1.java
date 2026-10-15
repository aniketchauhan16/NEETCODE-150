/*
 * Problem #1047: Remove All Adjacent Duplicates In String
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 9/4/2026, 3:11:39 PM
 * Link: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
 */

class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            int size = sb.length();

            if(size > 0 && sb.charAt(size-1) == c){
                sb.deleteCharAt(size -1);
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
