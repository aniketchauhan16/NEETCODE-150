class Solution {
    public boolean isPalindrome(String s) {
        String cleanText = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i =0; int j = cleanText.length()-1;
        while(i<=j){
            if(cleanText.charAt(i) != cleanText.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}