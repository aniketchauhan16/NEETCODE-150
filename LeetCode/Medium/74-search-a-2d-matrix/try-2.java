/*
 * Problem #74: Search a 2D Matrix
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 8/25/2026, 6:52:23 AM
 * Link: https://leetcode.com/problems/search-a-2d-matrix/
 */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int n = matrix.length; int m = matrix[0].length;
    int low =0; int high = n*m-1;

    while(low<= high){

    int mid = (low+high)/2;
    int row = mid/m; int col = mid%m;
    if(matrix[row][col] == target){
        return true;
    }
    else if(matrix[row][col] < target){
        low = mid+1;
    }
    else{
        high = mid-1;
    }
    }
    return false;
    }
}
