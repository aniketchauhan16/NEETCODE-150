/*
 * Problem #49: Group Anagrams
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 7/29/2026, 11:02:16 PM
 * Link: https://leetcode.com/problems/group-anagrams/
 */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap < String , List<String>> hm = new HashMap<>();

        for(String s:strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);

            hm.putIfAbsent(sortedS,new ArrayList<>());
            hm.get(sortedS).add(s) ;
        }
        return new ArrayList<>(hm.values());
    }
}
