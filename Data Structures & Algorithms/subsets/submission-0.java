class Solution {
    static  List<List<Integer>> ans ;
    public List<List<Integer>> subsets(int[] nums) {
        ans = new ArrayList<>();
        solve(nums,0, new ArrayList<>());
        return ans ;
    }
    private static void solve(int nums[] , int idx ,List<Integer> cur){
           
        if(idx==nums.length){
                  ans.add(new ArrayList<>(cur));
                  return ;
        }
        cur.add(nums[idx]);
        solve(nums,idx+1,cur);
        cur.remove(cur.size()-1);
        solve(nums,idx+1,cur);
       
    }
}
