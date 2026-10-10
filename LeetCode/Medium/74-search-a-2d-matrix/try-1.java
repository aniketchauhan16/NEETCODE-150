/*
 * Problem #74: Search a 2D Matrix
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 3/19/2026, 3:48:30 PM
 * Link: https://leetcode.com/problems/search-a-2d-matrix/
 */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++) {
               if( target == matrix[i][j]) {
               return true;
              }
            }
        } 
              return false;
    }
}
