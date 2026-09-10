class Solution {
    public boolean canJump(int[] nums) {
         int idx  = 0 ;
    for(int i = 0 ; i< nums.length ; i++){
        if(idx < i) return false ;
           idx = Math.max(idx , i + nums[i]);
     }
         return (idx >= nums.length -1) ;
    }
}
