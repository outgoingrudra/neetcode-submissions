class Solution {
    public int[] sortedSquares(int[] nums) {
        int  n  = nums.length ;
        int l  = 0 , r = n-1 ;

        int ans[] = new int[n];
        for(int i  = n-1 ; i >= 0 ;i--){
            int x  = nums[l]*nums[l];
            int y  = nums[r]*nums[r];
            if(x>y){
                 ans[i] = x;
                 l++;
            }
            else{
                ans[i]= y;
                r--;
            }
        }
        return ans ;
    }
}