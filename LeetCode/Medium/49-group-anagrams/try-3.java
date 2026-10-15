/*
 * Problem #49: Group Anagrams
 * Difficulty: Medium
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 8/2/2026, 12:21:47 AM
 * Link: https://leetcode.com/problems/group-anagrams/
 */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hm = new HashMap<>();
        for(String s : strs){
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String SortedS = new String(charArray);
        hm.putIfAbsent(SortedS,new ArrayList<>());
        hm.get(SortedS).add(s);
        }
    return new ArrayList<>(hm.values());

    }
}
