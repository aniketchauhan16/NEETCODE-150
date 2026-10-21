/*
 * Problem #217: Contains Duplicate
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 9/11/2025, 11:33:32 PM
 * Link: https://leetcode.com/problems/contains-duplicate/
 */

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> seen = new HashSet<>();
        for(int num : nums) {
            if(seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
