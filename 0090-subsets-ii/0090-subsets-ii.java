class Solution {
    public List<List<Integer>> ans;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ans = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> ds = new ArrayList<>();
        reccurSub(0,nums,ds);
        return ans;
    }

    public void reccurSub(int index,int[] nums,List<Integer> ds){
            ans.add(new ArrayList<>(ds));

        for(int i = index;i<nums.length;i++){
            if(i>index && nums[i] == nums[i-1]) continue;

            ds.add(nums[i]);
            reccurSub(i+1, nums,ds);
            ds.remove(ds.size()-1);
        }
    }
}