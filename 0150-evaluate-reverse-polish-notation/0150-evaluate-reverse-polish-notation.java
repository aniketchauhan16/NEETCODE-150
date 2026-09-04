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