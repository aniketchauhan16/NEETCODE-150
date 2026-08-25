class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0; int r =0;
        for(int w:weights){
            l = Math.max(l,w);
            r+= w;
        }
    
        while(l<r){
         int mid = l+(r-l)/2;

         int needed = daysNeeded(weights,mid);
         if(needed <= days){
            r = mid;
         }
         else{
            l = mid+1;
         }
        }
        return l;
    }

        private int daysNeeded(int[] weights,int capacity){
            int currLoad = 0; int days =1;
            for(int w:weights){
                if(currLoad + w > capacity){
                    days++;
                    currLoad = w;
                }
                else{
                    currLoad += w;
                }
            }
            return days;
        }
}