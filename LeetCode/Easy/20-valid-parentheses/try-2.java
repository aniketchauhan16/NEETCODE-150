/*
 * Problem #20: Valid Parentheses
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 10/21/2026, 11:48:07 AM
 * Link: https://leetcode.com/problems/valid-parentheses/
 */

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if ( c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()) return false;
                char top = stack.pop();

                if( c == ')' && top != '(') return false;
                if( c == ']' && top != '[') return false;
                if( c == '}' && top != '{') return false;
                
            }
        }
        return stack.isEmpty();
    }
}
