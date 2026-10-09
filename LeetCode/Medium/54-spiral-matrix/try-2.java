/*
 * Problem #54: Spiral Matrix
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 6/13/2026, 10:01:00 AM
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
            // Move 1: Left to Right across the top row
                for(int i =left ;i<= right; i++){
                    result.add(matrix[top][i]);
                    }
                top++; // to the next below row
            
            // Move 2: Top to Bottom down the right column
                for(int i = top;i<= bottom; i++){
                    result.add(matrix[i][right]);
                }
                right--; // to the next left row
            // Move 3: Right to Left across the bottom row (only if rows remain)
                if(top <= bottom ){
                    for(int i = right; i >= left; i--){
                        result.add(matrix[bottom][i]);
                        }
                    bottom--;
                }
            // Bottom to Top up the left column (only if columns remain)
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
