/*
 * Problem #76: Minimum Window Substring
 * Difficulty: Hard
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 9/20/2026, 4:04:10 AM
 * Link: https://leetcode.com/problems/minimum-window-substring/
 */

class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty()) return "";

        Map<Character,Integer> countT = new HashMap<>();
        Map<Character,Integer> window = new HashMap<>();

        for(char c : t.toCharArray()){
            countT.put(c,countT.getOrDefault(c,0)+1);
        }

        int l =0; int have = 0; int[] res = {-1,-1};
        int need = countT.size(); int minLen = Integer.MAX_VALUE;

        for(int r = 0;r<s.length();r++){
            char c = s.charAt(r);
            window.put(c,window.getOrDefault(c,0)+1);

            if(countT.containsKey(c) && window.get(c).equals(countT.get(c))){
                have++;
            }
            while(have == need ){
                if(r-l+1 < minLen){
                    minLen = r-l+1;
                    res[0] = l;
                    res[1] = r;}
                    char leftchar = s.charAt(l);
                    window.put(leftchar,window.get(leftchar) - 1);
                    if(countT.containsKey(leftchar) && window.get(leftchar) < countT.get(leftchar)){
                        have--;
                    }
                    l++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(res[0],res[1]+1);
    }
}
