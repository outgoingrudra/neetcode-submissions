class Solution {
    public int majorityElement(int[] nums) {
        int el = 0;
       int cnt = 0;
       for(int x : nums){
        if(cnt==0){
            el = x;
            cnt =1;
        }
        else if(x== el){
            cnt++;
        }
        else cnt--;
       }
       return el ;
    
    }
}