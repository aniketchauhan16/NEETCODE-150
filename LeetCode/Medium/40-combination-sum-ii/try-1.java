/*
 * Problem #40: Combination Sum II
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 2/24/2026, 7:14:39 AM
 * Link: https://leetcode.com/problems/combination-sum-ii/
 */

class Solution {
    
    
    private void findcombinations(int index,int[] arr,int target,List<List<Integer>> ans,List<Integer> ds ){
        if (target==0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<arr.length;i++){
            if (i>index && arr[i] == arr[i-1]) continue;
            if(arr[i] > target ) break;
            
            ds.add(arr[i]);
            findcombinations(i+1, arr, target-arr[i], ans, ds);
            ds.remove(ds.size()-1);
        }
    }

 
      public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
         Arrays.sort(candidates);
        findcombinations(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}
