/*
 * Problem #1: Two Sum
 * Difficulty: Easy
 * Submission: Try 5
 * status: Accepted
 * Language: java
 * Date: 10/1/2026, 5:25:31 AM
 * Link: https://leetcode.com/problems/two-sum/
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
int n = nums.length;

for (int i = 0; i < n; i++) {
    int complement = target - nums[i];

    if (hm.containsKey(complement)) {
        return new int[]{hm.get(complement), i};
    }
    
    hm.put(nums[i], i);
}

return new int[]{};

    }
}
