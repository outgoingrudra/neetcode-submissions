class Solution {
    List<List<Integer>> ans  = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        solve(candidates , 0 , target , new ArrayList<>());
        return ans ;
    }
    private void solve(int[]  nums , int idx , int t , List<Integer> curr){
        int n  = nums.length ;
        if( t == 0){
            ans.add(new ArrayList<>(curr));
            return ;
        }
        if(t < 0 || idx == n) return ;
          for (int i = idx; i < nums.length; i++) {

            // Skip duplicate choices at the same level
            if (i > idx && nums[i] == nums[i - 1]) {
                continue;
            }

            // Since sorted, no later element can work
            if (nums[i] > t) {
                break;
            }

            curr.add(nums[i]);

            solve(nums, i + 1, t - nums[i], curr);

            curr.remove(curr.size() - 1);
        }
    }
}
