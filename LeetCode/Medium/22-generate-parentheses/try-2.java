/*
 * Problem #22: Generate Parentheses
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 8/10/2026, 11:49:00 AM
 * Link: https://leetcode.com/problems/generate-parentheses/
 */

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder stack = new StringBuilder();
        backtrack(0,0,n,ans,stack);
        return ans;
    }
    
    private void backtrack(int open,int close,int n,List<String> ans, StringBuilder stack){
        if(open == close && close == n){
            ans.add(stack.toString());
            return;
        }
        
        if(open<n){
            stack.append('(');
            backtrack(open+1,close,n,ans, stack);
            stack.deleteCharAt(stack.length()-1);
        }
        if(close<open){
            stack.append(')');
            backtrack(open,close+1,n,ans, stack);
            stack.deleteCharAt(stack.length()-1);
        }
        
    }
}
