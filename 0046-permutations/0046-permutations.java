class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        reccurpermute(0,nums,ans);
        return ans;
    }

    private void reccurpermute(int index,int[] nums,List<List<Integer>> ans ){
        if(index == nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int num:nums){
                ds.add(num);
            }
            ans.add(ds);
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(i,index,nums);
            reccurpermute(index+1,nums,ans);
            swap(i,index,nums);
        }
    }
    private void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}