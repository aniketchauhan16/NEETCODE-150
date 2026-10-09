/*
 * Problem #15: 3Sum
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 8/12/2026, 11:22:28 PM
 * Link: https://leetcode.com/problems/3sum/
 */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); int n = nums.length;
        for(int i =0;i<n;i++){
            if(nums[i]>0) break;
            if(i>0 && nums[i] == nums[i-1]) continue;
            int l = i+1; int r = nums.length-1;
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;r--;
                    while(l<r && nums[l] == nums[l-1]) l++;
                    while(l<r && nums[r] == nums[r+1]) r--;
                }
                else if(sum>0) r--;
                else{ l++; }
            }
        }
        return ans;
    }
}
