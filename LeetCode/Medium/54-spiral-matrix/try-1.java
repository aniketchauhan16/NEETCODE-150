/*
 * Problem #54: Spiral Matrix
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 6/13/2026, 9:50:48 AM
 * Link: https://leetcode.com/problems/spiral-matrix/
 */

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         List result = new ArrayList<>();
        
         int top = 0;
         int bottom = matrix.length-1;
         int left =0;
         int right = matrix[0].length-1;

        while(top <= bottom && left <= right){
            // the top from right to left
                for(int i =left ;i<= right; i++){
                    result.add(matrix[top][i]);
                    }
                top++; // to the next below row
            
            // the right row from top to bottom
                for(int i = top;i<= bottom; i++){
                    result.add(matrix[i][right]);
                }
                right--; // to the next left row
            // the bottom from right to left (only if rows remain)
                if(top <= bottom ){
                    for(int i = right; i >= left; i--){
                        result.add(matrix[bottom][i]);
                        }
                    bottom--;
                }
            // the left from bottom to top
            if(left <= right){
                    for(int i =bottom;i>= top;i--){
                        result.add(matrix[i][left]);
                    }
                    left++;
            }
        }
    return result;
    }
}
