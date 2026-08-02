class Solution {
    static  List<List<Integer>> ans ;
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
         Arrays.sort(nums);
         ans =  new ArrayList<>();
         solve(nums,0,target,new ArrayList<>());
         return ans ;

    }
    private static void solve(int[] nums ,int idx , int target , List<Integer> cur){
        if(target==0){
            ans.add(new ArrayList(cur));
            return ;
        }
        for(int i = idx ; i < nums.length ;i++){
            if(i>idx && nums[i]==nums[i-1]) continue ;
            if(nums[i]>target ) break ;

            cur.add(nums[i]);
            solve(nums,i+1,target- nums[i],cur);
            cur.remove(cur.size()-1);
           
        }
    }
}
