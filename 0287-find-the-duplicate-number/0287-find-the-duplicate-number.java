class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int low =1;int high = n-1;
        while(low<high){
            int mid = low+(high-low)/2;
            int cnt =0;
            for(int num :nums){
                if(num <= mid){
                    cnt++;
                }
            }
            if(cnt > mid){
                high = mid;
            }
            else{low = mid+1;}
        }
    return low;
    }
}