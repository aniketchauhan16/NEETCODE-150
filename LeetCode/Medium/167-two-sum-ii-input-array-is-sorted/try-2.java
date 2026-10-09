/*
 * Problem #167: Two Sum II - Input Array Is Sorted
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 9/15/2026, 8:41:34 PM
 * Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0; int right = numbers.length-1;

        while(left < right){
            if(numbers[left] + numbers[right] == target ){
                return new int[]{left+1,right+1};
            }
            else if(numbers[left] + numbers[right] > target ){
                right--;
            }
            else{
                left++;
            }
        } 
        return new int[]{-1,-1};
    }
}
