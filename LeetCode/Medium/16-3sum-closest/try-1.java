/*
 * Problem #16: 3Sum Closest
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 9/16/2026, 11:22:58 AM
 * Link: https://leetcode.com/problems/3sum-closest/
 */

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] +  nums[2];
        int n = nums.length;
        for(int i = 0 ; i<n-2;i++){
            int left = i+1; int right = n-1;
            while(left < right){
            int sum = nums[i] + nums[left] + nums[right];
                if(Math.abs(target-sum) < Math.abs(target - result)){
                    result = sum;
                }
                if( sum == target ) return target;
                else if(sum < target ) left++;
                else right--;
            }
        }
        return result;
    }
}
