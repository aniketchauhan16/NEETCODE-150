/*
 * Problem #169: Majority Element
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 11/4/2025, 5:23:19 AM
 * Link: https://leetcode.com/problems/majority-element/
 */

class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int el = 0;
        int n = nums.length;

        for(int i=0;i<n;i++){
            if (cnt ==0) {
                cnt = 1;
                el = nums[i];   
            }
            else if (nums[i] == el) {
                cnt++;
            }
            else{
                cnt--;
            }
        }

        int cnt1 = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == el){
                cnt1++;
                
                if (cnt1 > (n/2)) {
                    return el;
                }
            }
        }
        return -1;
    }
}
