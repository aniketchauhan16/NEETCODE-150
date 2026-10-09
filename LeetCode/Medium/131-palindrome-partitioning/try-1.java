/*
 * Problem #131: Palindrome Partitioning
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 8/11/2026, 9:57:23 AM
 * Link: https://leetcode.com/problems/palindrome-partitioning/
 */

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        backtrack(0,ans,curr,s);
        return ans;
    }

    private void backtrack(int index,List<List<String>> ans,List<String> curr,String s){
        if(index == s.length()){
            ans.add(new ArrayList<>(curr) );
            return;
        }
        for(int i = index;i<s.length();i++){

        if(isPalin(s,index,i)){
            curr.add(s.substring(index,i+1));
            backtrack(i+1,ans,curr,s);
            curr.remove(curr.size()-1);
        }
        }

        }
        private boolean isPalin(String s,int l,int r){
            while(l<r){
                if(s.charAt(l) != s.charAt(r)){
                    return false;
                }
                l++;r--;
            }
            return true;
    }
}
