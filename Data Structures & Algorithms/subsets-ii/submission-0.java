class Solution {
    List<List<Integer>> ans ;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         ans = new ArrayList<>();
         Arrays.sort(nums);
         solve(nums , 0 , new ArrayList<>() );
         return ans ;
    }
    private  void solve(int nums[] , int idx , List<Integer> curr){
        ans.add(new ArrayList(curr));

        for(int i = idx ; i < nums.length ; i++){
            if(i!= idx && nums[i] == nums[i-1]) continue ;
            curr.add(nums[i]);
            solve(nums,i+1,curr);
            curr.remove(curr.size()-1);
        }
        
    }
}
