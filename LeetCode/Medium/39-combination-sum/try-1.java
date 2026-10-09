/*
 * Problem #39: Combination Sum
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 2/22/2026, 7:26:57 PM
 * Link: https://leetcode.com/problems/combination-sum/
 */

class Solution {

     private void findcombinations(int index,int[] arr,int target,List<List<Integer>> ans,List<Integer> ds){
        if (index == arr.length) {
          if(target==0){
            ans.add(new ArrayList<>(ds));
           }   return;
        }
        
        
        if (arr[index] <= target) {
            ds.add(arr[index]);
            findcombinations(index, arr, target-arr[index], ans, ds);
            ds.remove(ds.size()-1);
        }
        findcombinations(index + 1, arr, target, ans, ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> ans = new ArrayList<>();
        findcombinations(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}
