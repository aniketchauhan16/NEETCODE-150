/*
 * Problem #167: Two Sum II - Input Array Is Sorted
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 8/12/2026, 10:00:33 AM
 * Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
     int i = 0; int j = numbers.length-1;
     
     while(i<=j){
         if(numbers[i]+numbers[j]== target){
             return new int[]{i+1,j+1};
         }
         if(numbers[i]+numbers[j] < target){
             i++;
         }
         else{
             j--;
         }
     }
     return new int[]{-1,-1};
    }
}
