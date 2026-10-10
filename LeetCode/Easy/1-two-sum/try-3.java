/*
 * Problem #1: Two Sum
 * Difficulty: Easy
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 6/7/2026, 9:01:06 AM
 * Link: https://leetcode.com/problems/two-sum/
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int[] temp = new int[2];
        for (int i =0;i<nums.length; i++){
            int complement = target - nums[i];
            if (mp.containsKey(complement)){ 
                temp[0] = i;
                temp[1] = mp.get(complement);
                return temp;
            }
            mp.put(nums[i], i);
        }
        return temp;
    }
}
