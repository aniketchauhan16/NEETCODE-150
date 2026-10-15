/*
 * Problem #424: Longest Repeating Character Replacement
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 9/18/2026, 5:11:52 AM
 * Link: https://leetcode.com/problems/longest-repeating-character-replacement/
 */


        class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int res = 0; int l =0; int maxf = 0;

        for(int r =0;r<s.length();r++){
            hm.put(s.charAt(r),hm.getOrDefault(s.charAt(r),0)+1);
            maxf = Math.max(maxf,hm.get(s.charAt(r)));

            while((r-l +1) - maxf >k){
                hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
                l++;
            }
            res = Math.max(res,r-l+1);
        }
        return res;
    }

}
