class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0,right = n-1,sum=0;
        int left_max =0,right_max = 0;

        while(left < right){
            if(height[left] <= height[right]){
                if(height[left] <left_max){
                    sum += left_max - height[left];
                    left++;
                }
                else{
                    left_max = height[left];
                    left++;
                }
            }
            else{
                if(height[right] < right_max){
                    sum+= right_max - height[right];
                    right--;
                }
                else{
                    right_max = height[right];
                    right--;
                }
            }
        }
        return sum;
    }
}