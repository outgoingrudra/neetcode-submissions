class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i = 0; i< nums.length ;i++){
            int diff = target - nums[i];
            if(mpp.containsKey(diff)){
                int j = mpp.get(diff);
                ans[0] = j;
                ans[1] = i;
                return ans ;
            }
            mpp.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}




