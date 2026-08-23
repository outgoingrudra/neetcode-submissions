class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length ;
        if(n==0 || n==1) return true ;
     
        for(int i = 0  ; i < n-1 ;i++){
            if(nums[i] <= nums[i+1]){
                if(i== n-2) return true ;
                continue ;  
            }
            break ;

        }
        
        for(int i = 0  ; i < n-1 ;i++){
            if(nums[i] >=  nums[i+1]){
                if(i== n-2) return true ;
                continue ;  
            }
            break ;

        }
        return false ;
    }
}