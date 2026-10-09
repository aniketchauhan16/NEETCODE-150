/*
 * Problem #73: Set Matrix Zeroes
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 6/12/2026, 10:47:52 AM
 * Link: https://leetcode.com/problems/set-matrix-zeroes/
 */

class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length; int m = matrix[0].length;
        int[] rows = new int[n]; int[] col = new int[m];
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(matrix[i][j] == 0){
                    rows[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(rows[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                } 
            }
        }
    }
}
