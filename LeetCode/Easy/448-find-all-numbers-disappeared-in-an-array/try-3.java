/*
 * Problem #448: Find All Numbers Disappeared in an Array
 * Difficulty: Easy
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 7/22/2026, 11:27:44 PM
 * Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 */

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        for(int i =0;i<n;i++){
            int val = nums[i];
            int elem = Math.abs(val)-1;
            if(nums[elem] >0){
                nums[elem] = -nums[elem];
            }
        }
        for(int i =0;i<n;i++){
            if(nums[i]>0){
                result.add(i+1);
            }
        }
        return result;
    }
}
