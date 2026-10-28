/*
 * Problem #349: Intersection of Two Arrays
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 6/4/2026, 9:02:01 AM
 * Link: https://leetcode.com/problems/intersection-of-two-arrays/
 */

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] temp = new int[1000];
        int index =0;
        int n = nums1.length; int m = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while(i<n && j<m){
            if(nums1[i] == nums2[j]){
                 if (index == 0 || nums1[i] != temp[index - 1]) {
                      temp[index] = nums1[i];
                      index++;
                   }
                     i++;   j++; 
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return Arrays.copyOf(temp, index);
        //  public int[] intersection(int[] nums1, int[] nums2) {
        // Set<Integer> set = new HashSet<>();
        // Set<Integer> intersect = new HashSet<>();
        // for (int i = 0; i < nums1.length; i++) {
        //     set.add(nums1[i]);
        // }
        // for (int i = 0; i < nums2.length; i++) {
        //     if (set.contains(nums2[i])) {
        //         intersect.add(nums2[i]);
        //     }
        // }
        // int[] result = new int[intersect.size()];
        // int i = 0;
        // for (Integer num : intersect) {
        //     result[i++] = num;
        // }
        // return result;
    // }
    }
}
