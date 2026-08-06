class Solution {
    public List<List<Integer>> ans;
    public List<List<Integer>> permute(int[] nums) {
    ans = new ArrayList<>();
    List<Integer> ds = new ArrayList<>();

    reccurperm(0,nums);
    return ans;
    }

    public void reccurperm(int index,int[] nums){
        if(index == nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int i =0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = index;i<nums.length;i++){
            swap(i,index,nums);
            reccurperm(index+1,nums);
            swap(i,index,nums);
        }
        
    }

    public void swap(int i,int j,int[] nums){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}