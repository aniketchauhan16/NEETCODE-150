/*
 * Problem #46: Permutations
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 2/25/2026, 4:26:34 PM
 * Link: https://leetcode.com/problems/permutations/
 */

class Solution {
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        permutations(nums,ans,ds,freq);
        return ans;
    }

    public void permutations(int[] nums,List<List<Integer>> ans,List<Integer> ds,boolean freq[]){
     if (ds.size()== nums.length) {
        ans.add(new ArrayList<>(ds));
        return;
     }   
    for (int i = 0; i < nums.length; i++) {
        if(!freq[i]){
            freq[i] = true;
            ds.add(nums[i]);
            permutations(nums, ans, ds, freq);
            ds.remove(ds.size()-1);
            freq[i] = false;
        }
    }
    }
}
