class Solution {
    List<List<Integer>> ans  = new ArrayList<>();
    boolean used[] ;
    public List<List<Integer>> permute(int[] nums) {
        used = new boolean[nums.length];
        solve(nums, new ArrayList<>() );
        return ans ;
    }
    private void solve(int nums[]  , List<Integer> curr){
        if(curr.size()== nums.length){
             ans.add(new ArrayList<>(curr));
             return;
        }
        for(int i = 0 ; i < nums.length;i++){
            if(used[i]) continue;
            curr.add(nums[i]);
            used[i]=true;
            solve(nums,curr);
            curr.remove(curr.size()-1);
            used[i]= false ;
        }
    }
}
