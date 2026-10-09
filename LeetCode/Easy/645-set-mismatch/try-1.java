/*
 * Problem #645: Set Mismatch
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 11/23/2025, 10:39:42 PM
 * Link: https://leetcode.com/problems/set-mismatch/
 */

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] count = new int[nums.length + 1]; 
        int[] ans = new int[2];

        for (int num : nums) {
            count[num]++;
        }

        for (int i = 1; i <= nums.length; i++) {
            if (count[i] == 2) {    
                ans[0] = i;
            }
            if (count[i] == 0) {     
                ans[1] = i;
            }
        }

        return ans;
    }
}
