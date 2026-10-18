/*
 * Problem #169: Majority Element
 * Difficulty: Easy
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 7/22/2026, 11:35:36 AM
 * Link: https://leetcode.com/problems/majority-element/
 */

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int counter = 0;
        int elem = -1;
        for(int i=0;i<n;i++){
            if(counter == 0){
                elem = nums[i];
                
            }
            if (nums[i] == elem){
                counter++;
            }
            else{
                counter--;
            }
        }
        return elem;
    }
}
