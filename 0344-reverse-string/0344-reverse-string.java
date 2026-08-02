class Solution {
    public void reverseString(char[] s) {
        revStr(s,0,s.length-1);
    }

    public void revStr(char[] s,int low,int high){
        if(low > high) return;
        
        swap(s,low,high);
        revStr(s,low+1,high-1);
    }

    public void swap(char[] s,int low,int high){
        char temp = s[low];
        s[low] = s[high];
        s[high] = temp;
    }
}