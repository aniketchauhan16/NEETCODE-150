/*
 * Problem #229: Majority Element II
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 4/15/2026, 11:27:50 PM
 * Link: https://leetcode.com/problems/majority-element-ii/
 */

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length; 
        int cnt1 =0,cnt2 =0;
        int el1=Integer.MIN_VALUE,el2=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(cnt1 ==0 && el2 != nums[i] ){
                cnt1 = 1;
                el1 = nums[i];
            }
            else if(cnt2 ==0 && el1!= nums[i]){
                cnt2 = 1;
                el2 = nums[i];
            }
            else if(el1 == nums[i] ){
                cnt1++;
            }
            else if(el2 == nums[i]){
                cnt2++;
            }
            else {
                cnt1--;
                cnt2--;
            }
        }
            cnt1 =0; cnt2 = 0;
            for(int i =0;i<n;i++){
                if(nums[i] == el1) cnt1++;
                if(nums[i] == el2) cnt2++;
            }

            int mini = n/3+1;
            List<Integer> list = new  ArrayList<>();
            if(cnt1 >= mini) list.add(el1);
            if(cnt2 >= mini) list.add(el2);
            return list;

        
    }
}
