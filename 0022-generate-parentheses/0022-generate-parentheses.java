class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder stack = new StringBuilder();
        reccurparen(0,0,n,ans,stack);
        return ans;
    }

    private void reccurparen(int openN,int closeN,int n,List<String> ans,StringBuilder stack){
        if(openN == closeN && closeN == n) {
            ans.add(stack.toString());
            return;
        }
        if(openN< n){
            stack.append('(');
            reccurparen(openN+1,closeN,n,ans,stack);
            stack.deleteCharAt(stack.length()-1);
        }
        if(closeN<openN){
            stack.append(')');
            reccurparen(openN,closeN+1,n,ans,stack);
            stack.deleteCharAt(stack.length()-1);
        }
    }
}