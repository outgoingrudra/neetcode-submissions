class Solution {
    static  List<List<Integer>> ans ;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
         ans =  new ArrayList<>();
         solve(nums,0,target,new ArrayList<>());
         return ans ;

    }
    private static void solve(int[] nums ,int idx , int target , List<Integer> cur){
        if(target==0){
            ans.add(new ArrayList(cur));
            return ;
        }
        if(idx==nums.length  || target < 0) return ;
        cur.add(nums[idx]);
        solve(nums,idx, target - nums[idx],cur);
        cur.remove(cur.size()-1);
        solve(nums,idx+1, target ,cur);
    }
}
