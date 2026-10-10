/*
 * Problem #739: Daily Temperatures
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 9/6/2026, 11:47:18 PM
 * Link: https://leetcode.com/problems/daily-temperatures/
 */

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();
        for(int i =0;i<temperatures.length;i++){
            int t = temperatures[i];
            
            while(!stack.isEmpty() && t>stack.peek()[0]){
                int[] pair = stack.pop();
                res[pair[1]] = i - pair[1];
            }
            stack.push(new int[]{t,i});
        }
        return res;
    }
}
