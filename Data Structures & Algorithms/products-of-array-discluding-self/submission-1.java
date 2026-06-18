class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul = 1;
        int zeros = 0;
        for(int x : nums){
            if(x!=0) mul *= x;
            else if(x==0) zeros++;
        }
        int ans[] = new int[nums.length];
        for(int i = 0 ;i< nums.length ;i++){
            if(zeros>1) ans[i]= 0;
            else if(zeros==1){
                if(nums[i]==0) ans[i] = mul ;
                else ans[i] =0;
            }
            else{
                ans[i] = mul/nums[i];
            }
        }
        return ans ;

    }
}  
