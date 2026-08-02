class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return isreccur(cleaned,0,cleaned.length()-1);
    }

    public boolean isreccur(String s,int low,int high){
        if(low>high) return true;
        if(s.charAt(low) == s.charAt(high)){
            return isreccur(s,low+1,high-1);
        }
        return false;

        
    }
}