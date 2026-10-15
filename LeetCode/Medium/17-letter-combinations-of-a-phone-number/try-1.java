/*
 * Problem #17: Letter Combinations of a Phone Number
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 8/10/2026, 4:08:15 PM
 * Link: https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 */

class Solution {
    private List<String> ans = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return ans;
        backtrack(0,"",digits);
        return ans;
    }
    private String[] digitToChar = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    private void backtrack(int i,String curr,String digits){
        if(i == digits.length()){
            ans.add(curr);
            return;
        }
        
        String chars= digitToChar[digits.charAt(i)-'0'];
        for(char c: chars.toCharArray()){
            backtrack(i+1,curr+c,digits);
        }
    }
}

