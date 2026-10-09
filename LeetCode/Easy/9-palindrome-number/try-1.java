/*
 * Problem #9: Palindrome Number
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 3/19/2026, 2:23:04 PM
 * Link: https://leetcode.com/problems/palindrome-number/
 */

class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int rev = 0;
while (x > 0){
int dig = x % 10;
    rev = rev * 10 + dig;
    x = x / 10;
}
    if(n==rev) return true;
    return false;
    }
}
