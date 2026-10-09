/*
 * Problem #20: Valid Parentheses
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 9/4/2026, 4:33:28 PM
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
