/*
 * Problem #150: Evaluate Reverse Polish Notation
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 9/4/2026, 10:11:38 PM
 * Link: https://leetcode.com/problems/evaluate-reverse-polish-notation/
 */

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String c : tokens){
            if(c.equals("+"))
            stack.push(stack.pop() + stack.pop());

            else if (c.equals("-")){
                int A = stack.pop();
                int B = stack.pop();
                stack.push(B-A);
            }

            else if(c.equals("*")) 
            stack.push(stack.pop() * stack.pop());

            else if(c.equals("/")){
                int A = stack.pop();
                int B = stack.pop();
                stack.push(B/A);}

            else{
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.pop();
    }
}
