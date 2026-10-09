/*
 * Problem #912: Sort an Array
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 2/24/2026, 10:01:56 PM
 * Link: https://leetcode.com/problems/sort-an-array/
 */

class Solution {
    public int[] sortArray(int[] nums) {
        int low =0;
        int high = nums.length-1;
        
       mergeSort(nums,low,high);
       return nums;
            }

    public void mergeSort(int[] arr,int low,int high){
        if (low== high) return;
        
        int mid = (high+low)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }
    
     public void merge(int[] arr,int low,int mid,int high){
         List<Integer> temp = new ArrayList<>();
        int left =low;
        int right = mid+1;
        while (left<=mid && right <=high  ){
            if (arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            }
            else temp.add(arr[right++]);
        }
        while (left<= mid) {
            temp.add(arr[left++]);
        }
        while (right<= high) {
            temp.add(arr[right++]);
        }
         for (int i = low; i <= high; i++)
            arr[i] = temp.get(i - low);
    
    
    }
}
