/*
 * Problem #744: Find Smallest Letter Greater Than Target
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 8/21/2026, 7:18:19 AM
 * Link: https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 */

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0; int high = letters.length-1; char ans = letters[0]; 
        while(low<=high){
            int mid = low + (high-low)/2;
            if( letters[mid] <= target ){
                low = mid+1;
                
            }
            else if(letters[mid] > target){
                    high = mid-1;
                    ans = letters[mid];
            }
        }
        return ans;
    }
}
