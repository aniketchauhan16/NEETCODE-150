/*
 * Problem #39: Combination Sum
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 8/6/2026, 12:06:53 AM
 * Link: https://leetcode.com/problems/combination-sum/
 */

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ds = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        reccurCombi(candidates,target,ds,0,ans);
        return ans;
    }
    public void reccurCombi(int[] candidates,int target,List<Integer> ds,int index,List<List<Integer>> ans){
       
            if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        if (index == candidates.length || target < 0) {
            return;
        }

        ds.add(candidates[index]);
        reccurCombi(candidates,target - candidates[index],ds,index,ans);
        ds.remove(ds.size()-1);
        reccurCombi(candidates,target,ds,index+1,ans);
        
    }

}
