/*
 * Problem #31: Next Permutation
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 6/10/2026, 1:59:39 PM
 * Link: https://leetcode.com/problems/next-permutation/
 */

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length; int index =-1;
        for(int i =n-2; i>= 0; i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;}
        }

        if(index == -1){
            reverse(nums,0,n-1);
            return;
        }

        for(int i = n-1; i >= index;i--){
            if(nums[i] > nums[index]){
            swap(nums,index,i);
            break;}
        }
        reverse(nums,index+1,n-1);
    }
        private void reverse(int arr[],int start,int end){
            while(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++; end--;
            }
        }
        private void swap(int arr[],int a,int b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;

        }


    }
