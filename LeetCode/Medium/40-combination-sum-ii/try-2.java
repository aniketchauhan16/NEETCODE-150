/*
 * Problem #40: Combination Sum II
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 8/6/2026, 11:54:01 PM
 * Link: https://leetcode.com/problems/combination-sum-ii/
 */

class Solution {
    public List<List<Integer>> ans;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ans = new ArrayList<>();
        Arrays.sort(candidates);
        reccurCombi(0,candidates,target,new ArrayList<>());
        return ans;
    }
    public void reccurCombi(int index,int[] candidates,int target,List<Integer> ds){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
        }

        for(int i= index;i<candidates.length;i++){
            if(i > index && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] > target) break;
        ds.add(candidates[i]);
        reccurCombi(i+1,candidates,target-candidates[i],ds);
        ds.remove(ds.size() - 1);
        
        }

    }
}
