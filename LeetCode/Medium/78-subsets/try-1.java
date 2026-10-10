/*
 * Problem #78: Subsets
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 8/3/2026, 11:58:26 AM
 * Link: https://leetcode.com/problems/subsets/
 */

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
       List<Integer> ds = new ArrayList<>();
       int index = 0;
       addsubset(index,ans,ds,nums);
       return ans;
    }
    
    public void addsubset(int index,List<List<Integer>> ans,List<Integer> ds,int[] nums){
        if(index == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
       ds.add(nums[index]);
       addsubset(index+1,ans,ds,nums);
       ds.remove(ds.size()-1);
       addsubset(index+1,ans,ds,nums);
    }
}
