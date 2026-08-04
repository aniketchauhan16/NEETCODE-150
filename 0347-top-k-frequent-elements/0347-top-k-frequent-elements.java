class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        List<int []> arr = new ArrayList<>();
        
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> count : hm.entrySet()){
            arr.add(new int[]{count.getValue(),count.getKey()});
        }
        arr.sort((a,b) -> b[0] - a[0]);
        int[] freq = new int[k];
        for(int i=0;i<k;i++){
            freq[i] = arr.get(i)[1];
        }
        return freq;
    }
}