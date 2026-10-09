/*
 * Problem #347: Top K Frequent Elements
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 7/30/2026, 10:22:56 PM
 * Link: https://leetcode.com/problems/top-k-frequent-elements/
 */

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> hm = new HashMap<>();
        for(int num : nums){
            hm.put(num,hm.getOrDefault(num,0) + 1);
        }
        List<int []> arr = new ArrayList<>();

        for(Map.Entry<Integer,Integer> count : hm.entrySet() ){
            arr.add( new int[]{count.getValue() , count.getKey()});
        }
        arr.sort( (a,b) -> b[0] - a[0] );

        int[] res = new int[k];
        for(int i =0;i<k;i++){
            res[i] = arr.get(i)[1];
        }
        return res;
    }
}
