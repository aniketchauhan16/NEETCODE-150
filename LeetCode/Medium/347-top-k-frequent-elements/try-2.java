/*
 * Problem #347: Top K Frequent Elements
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 7/31/2026, 7:44:06 PM
 * Link: https://leetcode.com/problems/top-k-frequent-elements/
 */

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> hm = new HashMap<>();
        List<Integer> [] freq = new List[nums.length+1];

        for(int i=0;i<freq.length;i++){
            freq[i] = new ArrayList<>();
        }

        for(int num: nums){
            hm.put(num,hm.getOrDefault(num,0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : hm.entrySet() ){
            freq[entry.getValue()].add( entry.getKey() );
        }
        
        int[] res = new int[k];
        int index = 0;
        for(int i = freq.length-1;i>0 && index < k;i--){
            for(int n:freq[i]){
                res[index++] = n;
                if(index ==k ) return res;
            }
        }
        return res;
    }
}
