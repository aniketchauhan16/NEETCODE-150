class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        reccursubs(0,nums,ans,ds);
        return ans;
    }

    private void reccursubs(int index, int[] nums,List<List<Integer>> ans,List<Integer> ds){
        if(index == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        ds.add(nums[index]);
        reccursubs(index+1,nums,ans,ds);
        ds.remove(ds.size()-1);
        reccursubs(index+1,nums,ans,ds);
    }
}