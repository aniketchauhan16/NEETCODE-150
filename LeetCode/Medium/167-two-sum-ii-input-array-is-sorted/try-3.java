/*
 * Problem #167: Two Sum II - Input Array Is Sorted
 * Difficulty: Medium
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 10/1/2026, 6:05:38 AM
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
