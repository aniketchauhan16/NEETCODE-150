/*
 * Problem #169: Majority Element
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 6/7/2026, 10:52:06 AM
 * Link: https://leetcode.com/problems/majority-element/
 */

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length; int counter =0; int elem =0;
        for(int i =0;i<n;i++){
            if(counter ==0){
                elem = nums[i];
                counter++;
            }
            else if(elem == nums[i])
                counter++;
            else
                counter--;    
        }
        return elem;
    }
}
