/*
 * Problem #48: Rotate Image
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 6/12/2026, 12:40:28 PM
 * Link: https://leetcode.com/problems/rotate-image/
 */

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length; int m = matrix[0].length;
        for(int i =0;i<n;i++){
            for(int j =i+1;j<m;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
           
        for(int i= 0;i<n;i++){
            int start = 0; int end = n-1;
            while(start<end){
            int temp = matrix[i][start];
            matrix[i][start] = matrix[i][end];
            matrix[i][end] = temp;
            start++; end--;
        }}
    }
}
