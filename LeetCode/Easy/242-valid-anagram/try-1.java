/*
 * Problem #242: Valid Anagram
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 4/17/2026, 5:13:01 AM
 * Link: https://leetcode.com/problems/valid-anagram/
 */

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
    HashMap<Character, Integer> hs = new HashMap<>();
        for(char c : t.toCharArray()){
            hs.put(c,hs.getOrDefault(c ,0) + 1);
        }

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(hs.containsKey(c)){
                hs.put(c,hs.get(c)-1);
                if(hs.get(c) == 0){
                    hs.remove(c);
                }
            }
        }return hs.size() <= 0;
    }
}
