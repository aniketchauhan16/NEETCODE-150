/*
 * Problem #229: Majority Element II
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 6/13/2026, 12:00:27 PM
 * Link: https://leetcode.com/problems/majority-element-ii/
 */

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
           if (n == 0) return list;
              if (n == 1) {
              list.add(nums[0]);
              return list;
        }

            int elem1 =0; int elem2 = 0;
            int cnt1 =0; int cnt2 =0;
            for(int i =0;i<n;i++){
                if(nums[i] == elem1){
                    cnt1++;
                }
                else if(nums[i] == elem2){
                    cnt2++;
                }
                else  if(cnt1==0){
                     elem1 = nums[i];
                     cnt1 =1;
                }
                else if(cnt2 == 0 ){
                     elem2 = nums[i];
                     cnt2 = 1;
                }
                else{
                    cnt1--;
                    cnt2--;
                }
            }
            
            cnt1 =0;
            cnt2 = 0;

            for(int i =0;i<n;i++){
                if(nums[i] == elem1){
                     cnt1 ++;
                }
               else if(nums[i] == elem2){
                    cnt2++;
                }
                }
                if(cnt1 > n/3){
                    list .add(elem1);
                }
                if(cnt2 > n/3){
                    list.add(elem2);
            }

            return list;
        }


    }

