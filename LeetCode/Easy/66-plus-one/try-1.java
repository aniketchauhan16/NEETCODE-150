/*
 * Problem #66: Plus One
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 8/27/2026, 10:23:47 PM
 * Link: https://leetcode.com/problems/plus-one/
 */

class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length -1;i>=0;i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length +1];
        result[0] = 1;
        return result;
    }
}
