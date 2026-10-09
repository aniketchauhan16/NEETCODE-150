/*
 * Problem #49: Group Anagrams
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 7/29/2026, 11:15:08 PM
 * Link: https://leetcode.com/problems/group-anagrams/
 */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap < String , List<String>> hm = new HashMap<>();

        for(String s:strs){
            int[] arr = new int[26];
            for(char c: s.toCharArray()){
            arr[ c - 'a']++;
                        }
            String key = Arrays.toString(arr);
            hm.putIfAbsent(key, new ArrayList<String>());
            hm.get(key).add(s);        }
        return new ArrayList<>(hm.values());
    }
}
