class Solution {
    public int maxSubArray(int[] nums) {
        int ans =  -10001; 
        int sum = 0 ;
        for(int x : nums){
           sum += x ;
           ans =  Math.max(sum,ans);
           if(sum<0) sum =0;

        }
        return ans ;
    }
}
