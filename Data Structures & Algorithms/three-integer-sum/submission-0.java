class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length ;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int i ,j,k;
        for(i=0;i<n-2;i++){
            if(i!=0 && nums[i]==nums[i-1]) continue ;
            j  = i+1;
            k =  n-1 ;
            while(j<k){
                int s = nums[i]+nums[j]+nums[k] ;
                if(s==0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
                else if(s<0) j++;
                else k--;
            }
            
        }
        return ans ;
    }
}
