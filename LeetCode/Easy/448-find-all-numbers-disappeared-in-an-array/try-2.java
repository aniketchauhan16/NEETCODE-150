/*
 * Problem #448: Find All Numbers Disappeared in an Array
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 7/22/2026, 12:29:43 PM
 * Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 */

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
       int n = nums.length;
        for(int i = 0;i<n;i++){
            int val = Math.abs(nums[i]);
            int index = val -1;
            if(nums[index]> 0){
                nums[index] = -nums[index];
            }
        }
        
        for(int i= 0;i<n;i++){
            if(nums[i]>0){
               result.add(i+1) ;
            }
        }
        return result;
    }
}
