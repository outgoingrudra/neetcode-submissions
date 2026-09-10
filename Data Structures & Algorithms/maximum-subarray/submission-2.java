class Solution {
    public int maxSubArray(int[] nums) {
        int sum  = 0  ;
        int ans = 0 ;
        int max  =  nums[0];
        for(int x : nums){
            sum+=x ;
            if(sum < 0) sum = 0 ;
            ans = Math.max(ans,sum);
            max = Math.max(max,x);
        }
        return ans==0 ? max : ans  ;
    }
}
