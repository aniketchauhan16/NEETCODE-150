/*
 * Problem #4056: Number of Intersecting Interval Pairs I
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 9/20/2026, 9:18:35 AM
 * Link: https://leetcode.com/problems/number-of-intersecting-interval-pairs-i/
 */

class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int cnt = 0;
        int n = intervals.length;

        for(int i =0;i<n;i++){
            for(int j = i +1;j<n;j++){
                if(intervals[i][0] <= intervals[j][1] && intervals[j][0] <= intervals[i][1]){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
