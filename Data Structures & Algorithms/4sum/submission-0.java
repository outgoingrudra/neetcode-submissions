class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans  = new ArrayList<>();
        Arrays.sort(nums);
        int i , j , k ,  l ;
        int n = nums.length ;
        for( i  = 0  ; i < n ;i++){
            if(i!=0 && nums[i]==nums[i-1]) continue ;
            for( j  = i+1  ; j < n ;j++ ){
                  if(j!=i+1 && nums[j]==nums[j-1]) continue ;
                  k  = j+1;
                  l = n-1 ;
                  while(k < l){
                    long s =(long)nums[i] + nums[j] + nums[k] + nums[l];
                    if(s < target) k++;
                    else if(s > target) l--;
                    else {
                        List<Integer> t  = new ArrayList<>();
                        t.add(nums[i]);
                        t.add(nums[j]);
                        t.add(nums[k]);
                        t.add(nums[l]);
                        ans.add(t);
                        k++;
                        l--;

                        while(k < l && nums[k] == nums[k-1]) k++;
                        while(k < l && nums[l] == nums[l+1]) l--;
                    }

                  }

            }
        }
        return ans ;
    }
}