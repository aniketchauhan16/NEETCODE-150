/*
 * Problem #48: Rotate Image
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 11/13/2025, 9:08:33 PM
 * Link: https://leetcode.com/problems/rotate-image/
 */

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // transposes our matrix 
        for(int i=0;i<n;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp =0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //now we want to bring first v-line at last and last v line at first;
        for(int i =0;i<n;i++){
            for(int j=0;j<(matrix[0].length)/2;j++){
            int temp =0;
             temp = matrix[i][j];
             matrix[i][j] = matrix[i][matrix.length-1-j];
             matrix[i][matrix.length-1-j] = temp;

            }
        }

    }
}
