class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int n = nums.length;
        if(n==0) return 0;
        int maxcount = 0;
        
        for(int num:nums){
            hs.add(num);
        }

        for(int num:hs){
            if(!hs.contains(num-1)){
                int length =1;
                while(hs.contains(num+length)){
                    length++;
                }
                maxcount = Math.max(maxcount,length);
            }
        }
        return maxcount;

    }
}