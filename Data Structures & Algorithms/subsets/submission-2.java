class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> ans  = new ArrayList<>();
       solve(nums ,0,  ans , new ArrayList<>() );
       return ans ;  
    }
    private void solve(int[] nums ,int idx ,List<List<Integer>> ans  , List<Integer> c  ){
            if(idx == nums.length) {
                ans.add( new ArrayList<>(c));
                return ;
            }

            c.add(nums[idx]);
            solve(nums,idx+1 , ans , c);
            c.remove(c.size()-1);
            solve(nums,idx+1 , ans , c);
    }
}
