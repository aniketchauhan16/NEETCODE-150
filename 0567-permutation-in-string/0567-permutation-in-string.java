class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        int[] s1count = new int[26];
        int[] s2count = new int[26];

        for(int i =0;i<s1.length();i++){
            s1count[s1.charAt(i)-'a']++;
            s2count[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(s1count,s2count)){
            return true;
        }

        int l =0;
        for(int r = s1.length();r<s2.length();r++){
            s2count[s2.charAt(r)-'a']++;
            s2count[s2.charAt(l)-'a']--;
            l++;
        if(Arrays.equals(s1count,s2count)){
            return true;
        }
        }
        return false;
    }
}