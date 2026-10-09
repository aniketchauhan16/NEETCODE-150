/*
 * Problem #4020: Elevator Requests I
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 8/15/2026, 9:22:27 PM
 * Link: https://leetcode.com/problems/elevator-requests-i/
 */

class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int totaltime =0;
        int currentfloor = 0;
        for (int i =0;i<requests.length;i++){
            totaltime += Math.abs(requests[i] - currentfloor);
            currentfloor = requests[i];
        }
        return totaltime;
    }
}
