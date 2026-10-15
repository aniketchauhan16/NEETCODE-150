/*
 * Problem #1: Two Sum
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 6/1/2026, 10:15:06 PM
 * Link: https://leetcode.com/problems/two-sum/
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> hm = new HashMap<>();
             for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i] ;
                if (hm.containsKey(complement)) {
                    return new int[]{hm.get(complement),i};
                }
                hm.put(nums[i], i);
             }
             return new int[]{-1,-1};
        
    }
}
