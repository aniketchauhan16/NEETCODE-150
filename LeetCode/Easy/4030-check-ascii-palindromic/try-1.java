/*
 * Problem #4030: Check ASCII Palindromic
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 8/23/2026, 9:00:20 AM
 * Link: https://leetcode.com/problems/check-ascii-palindromic/
 */

class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder ans = new StringBuilder();
        for(char ch: s.toCharArray()){
            String binary = String.format("%8s",Integer.toBinaryString(ch)).replace(' ','0');
            ans.append(binary);
        }
        String binString = ans.toString();
        int low =0; int high = binString.length() - 1; 
        while(low<=high){
            if(binString.charAt(low) != binString.charAt(high)){
                return false;
            }
            low++; high--;
        }
        return true;
    }
}
