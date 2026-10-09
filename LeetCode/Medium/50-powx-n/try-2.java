/*
 * Problem #50: Pow(x, n)
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 8/2/2026, 12:39:04 PM
 * Link: https://leetcode.com/problems/powx-n/
 */

class Solution {
    public double myPow(double x, int n) {
    long N = n;
    if(N<0){
        x= 1/x;
        N=-N;
    }
    return reccurpow(x,N,1.0);
    }
    
    public double reccurpow(double x,long N,double ans ){

        if(N==0)
            return ans;

        if(N %2 ==0){
            return reccurpow(x*x,N/2,ans) ;
        }
        else{
            return reccurpow(x,N-1,ans*x);
        }
    }

}
