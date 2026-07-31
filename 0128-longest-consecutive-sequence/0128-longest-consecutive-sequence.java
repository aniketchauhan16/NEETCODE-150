class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int longest =0;
        Set<Integer> hs = new HashSet<>();
        for(int num:nums){
            hs.add(num);
        }

        for(int num:hs){
            if(! hs.contains(num-1)){
                int length =1;
                while(hs.contains(num + length)){
                    length++;
                }
                longest = Math.max(longest,length);
            }
        }
        return longest;
    }
}