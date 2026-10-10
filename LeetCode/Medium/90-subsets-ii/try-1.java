/*
 * Problem #90: Subsets II
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 2/25/2026, 7:26:57 AM
 * Link: https://leetcode.com/problems/subsets-ii/
 */

class Solution {
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        findSubsets(0,nums,new ArrayList<>(),ans);
        return ans;
    }

    public void findSubsets(int index,int[] nums,List<Integer> ds,List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));
        for(int i = index;i<nums.length;i++){
            if(i!= index && nums[i] == nums[i-1] ) continue;
            ds.add(nums[i]);
            findSubsets(i+1, nums, ds, ans);
            ds.remove(ds.size()-1);
        }
    }
}
