/*
 * Problem #73: Set Matrix Zeroes
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 11/10/2025, 7:14:39 AM
 * Link: https://leetcode.com/problems/set-matrix-zeroes/
 */

class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[] row = new int[n];
        int[] col = new int[m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (matrix[i][j] == 0){
                    row[i] =1;
                    col[j] = 1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (row[i] ==1 || col[j] == 1){
                    matrix[i][j] =0;
                }
            }
        }

    }
}
