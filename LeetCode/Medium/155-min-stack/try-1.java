/*
 * Problem #155: Min Stack
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 9/4/2026, 9:50:19 PM
 * Link: https://leetcode.com/problems/min-stack/
 */

class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minstack;

    public MinStack() {
        stack = new Stack<>();
        minstack = new Stack<>();
    }
    
    public void push(int value) {
        stack.push(value);
        if(minstack.isEmpty() || value <= minstack.peek()) minstack.push(value);
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        int top = stack.pop();
        if(top == minstack.peek()) minstack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
