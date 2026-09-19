class Solution {
    List<List<Integer>> ans  = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        solve(nums , 0 , target , new ArrayList<>());
        return ans ;
    }
    private void solve(int[]  nums , int idx , int t , List<Integer> c){
        if(t == 0 ){
            ans.add(new ArrayList<>(c));
            return ;
        }
        if(idx == nums.length || t < 0) return ;

        c.add(nums[idx]);
        solve(nums , idx, t- nums[idx] , c );
        c.remove(c.size()-1);
         solve(nums , idx+1 , t , c );
    }
}
