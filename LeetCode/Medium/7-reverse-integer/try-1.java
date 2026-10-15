/*
 * Problem #7: Reverse Integer
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 8/29/2025, 9:16:28 AM
 * Link: https://leetcode.com/problems/reverse-integer/
 */

class Solution {
    public static int reverse(int x) {
        int rev = 0;
        while (x!=0) {
            int LastDigit= x%10;
            x=x/10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && LastDigit > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && LastDigit < -8)) {
                return 0;
            }
            rev = (rev*10)+ LastDigit;
        }
        return rev;
    }
  public static void main(String[] args){
        int answer = reverse(1234);
       System.out.println(answer);

    }
}
