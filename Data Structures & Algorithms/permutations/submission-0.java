class Solution {
    static List<List<Integer>> ans ;
    public List<List<Integer>> permute(int[] nums) {
        ans = new ArrayList<>();
        boolean used[] = new  boolean[nums.length  ];
        solve(nums,new ArrayList<>() , used );
        return ans ;
    }
    private static void solve(int nums[] , List<Integer> curr , boolean[] used){
        if(curr.size()==nums.length ){
            ans.add(new ArrayList(curr));
            return ;
        }
        for(int i = 0; i< nums.length ;i++){
            if(used[i]) continue ;
            curr.add(nums[i]);
            used[i]= true ;
            solve(nums,curr,used);
            curr.remove(curr.size()-1);
            used[i]=false ;
        }
    }
}
